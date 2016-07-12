<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include  page="/common/head.jsp"/>
<!DOCTYPE html>

<head>
<title>HTML5 Canvas可拖动的弹性大树摇摆动画DEMO演示</title>
<meta charset="utf-8" />
<link rel="stylesheet" href="/game/css/style.css" type="text/css" media="screen, projection" />
<script type="text/javascript" src="/game/js/verlet-1.0.0.js"></script>
</head>
<body>
<div style="text-align:center;clear:both;">


</div>
<canvas id="scratch" style="width: 800px; height: 500px;"></canvas>
<script type="text/javascript">

	function lerp(a, b, p) {
		return (b - a) * p + a;
	}

	VerletJS.prototype.tree = function (origin, depth, branchLength, segmentCoef, theta) {

		var lineCoef = 0.7;
		this.origin = origin;
		this.base = new Particle(origin);
		this.root = new Particle(origin.add(new Vec2(0, 10)));


		var composite = new this.Composite();
		composite.particles.push(this.base);
		composite.particles.push(this.root);
		composite.pin(0);
		composite.pin(1);


		var branch = function (parent, i, nMax, coef, normal) {
			var particle = new Particle(parent.pos.add(normal.scale(branchLength * coef)));
			composite.particles.push(particle);

			var dc = new DistanceConstraint(parent, particle, lineCoef);
			dc.p = i / nMax; // a hint for drawing
			composite.constraints.push(dc);

			particle.leaf = !(i < nMax);

			if (i < nMax) {
				var a = branch(particle, i + 1, nMax, coef * coef, normal.rotate(new Vec2(0, 0), -theta));
				var b = branch(particle, i + 1, nMax, coef * coef, normal.rotate(new Vec2(0, 0), theta));


				var jointStrength = lerp(0.7, 0, i / nMax);
				composite.constraints.push(new AngleConstraint(parent, particle, a, jointStrength));
				composite.constraints.push(new AngleConstraint(parent, particle, b, jointStrength));
			}

			return particle;
		}

		var firstBranch = branch(this.base, 0, depth, segmentCoef, new Vec2(0, -1));

		composite.constraints.push(new AngleConstraint(this.root, this.base, firstBranch, 1));

		// animates the tree at the beginning
		var noise = 10;
		var i;
		for (i = 0; i < composite.particles.length; ++i)
			composite.particles[i].pos.mutableAdd(new Vec2(Math.floor(Math.random() * noise, Math.floor(Math.random() * noise))));

		this.composites.push(composite);
		return composite;
	}

	window.onload = function () {
		var canvas = document.getElementById("scratch");

		// canvas dimensions
		var width = parseInt(canvas.style.width);
		var height = parseInt(canvas.style.height);

		// retina
		var dpr = window.devicePixelRatio || 1;
		canvas.width = width * dpr;
		canvas.height = height * dpr;
		canvas.getContext("2d").scale(dpr, dpr);

		// simulation
		var sim = new VerletJS(width, height, canvas);
		sim.gravity = new Vec2(0, 0);
		sim.friction = 0.98;

		// entities
		var tree1 = sim.tree(new Vec2(width / 4, height - 120), 5, 70, 0.95, (Math.PI / 2) / 3);
		var tree2 = sim.tree(new Vec2(width - width / 4, height - 120), 5, 70, 0.95, (Math.PI / 2) / 3);

		tree2.drawParticles = function (ctx, composite) {
			var i;
			for (i = 0; i < composite.particles.length; ++i) {
				var particle = composite.particles[i];
				if (particle.leaf) {

					ctx.beginPath();
					ctx.arc(particle.pos.x, particle.pos.y, 25, 0, 2 * Math.PI);
					ctx.fillStyle = "#679d7c";
					ctx.fill();
				}
			}
		}

		tree2.drawConstraints = function (ctx, composite) {
			var i;

			ctx.save();
			ctx.strokeStyle = "#543324";
			ctx.lineCap = "round";

			for (i = 0; i < composite.constraints.length; ++i) {
				var constraint = composite.constraints[i];
				if (!(constraint instanceof DistanceConstraint && typeof constraint.p != "undefined"))
					continue;

				ctx.beginPath();
				ctx.moveTo(constraint.a.pos.x, constraint.a.pos.y);
				ctx.lineTo(constraint.b.pos.x, constraint.b.pos.y);
				ctx.lineWidth = lerp(10, 2, constraint.p);
				ctx.stroke();
			}

			ctx.restore();
		}


		// animation loop
		var loop = function () {
			sim.frame(16);
			sim.draw();
			requestAnimFrame(loop);
		};

		loop();
	};

	
</script>

</body>
</html>
<jsp:include page="/common/footer.html" />
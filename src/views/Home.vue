<template>
	<body>
		<div class="main-container">
			<div class="main-logo">
				<img src="../assets/Main-logo.png" />
			</div>
			<div class="greeting">
				<h2 id="welcome">Making Stronger Bodies, One Syntax At a Time</h2>
				<div class="about-container">
				<p class="about-text">
					CrossFit Syntactical is your one-stop-shop for CrossFit (and other)
					fitness classes!
				</p>
					
				<p class="about-text">CrossFit Syntactical members can use this space to set fitness goals 
					for themselves, log their workouts, and track progress towards goals 
					via individualized metrics!
				</p>

				<p class="about-text">Sign up and get started today!
				</p>
				</div>
				<router-link
						id="login"
						v-if="$store.state.token === ''"
						v-bind:to="{ name: 'login' }"
						>
				<button class="btn">
					Lets Get Started
				</button>
				</router-link>
			</div>
		</div>
	</body>
</template>

<script>
import classService from '../services/ClassService';
export default {
	created() {
		classService.getClasses().then((response) => {
			this.$store.commit('SET_CLASS_LIST', response.data);
		});
	},
};
</script>

<style scoped>
body {
	position: relative;
	min-height: 100%;
	min-width: 100%;
	width: 100%;
	height: 100vh;
}
body::before {
	content: '';
	position: absolute;
	top: 0;
	bottom: 0;
	left: 0;
	right: 0;
	background-image: linear-gradient(
			180deg,
			rgba(0, 0, 0, 0.5),
			rgba(0, 0, 0, 0.5)
		),
		url('../assets/Crossfit-home-page.jpg');
	background-position: top center;
	opacity: 0.9;
	box-shadow: rgba(0, 229, 255, 0.349) 0px 100px 100px -12px inset,
		rgba(1, 187, 255, 0.3) 0px 18px 36px -18px inset;
	background-size: cover;
}

.main-logo {
	text-align: center;
	position: relative;
}
.greeting {
	position: relative;
	color: rgb(255, 255, 255);
	display: flex;
	justify-content: center;
	margin: 20px 40px 20px 40px;
	flex-direction: column;
	align-items: center;
	padding: 10px;
}

.btn {
	position: relative;
color: rgb(20, 255, 247);
	display: inline-block;
	outline: 0;
	border: 0;
	cursor: pointer;
	will-change: box-shadow, transform;
	background: radial-gradient(100% 100% at 100% 0%, #03ffc0f3 0%, #00e0fe 100%);
	box-shadow: 0px 2px 4px rgb(45 35 66 / 40%),
		0px 7px 13px -3px rgb(45 35 66 / 30%),
		inset 0px -3px 0px rgb(58 65 111 / 50%);
	padding: 0 32px;
	border-radius: 6px;
	color: #000;
	width: 350px;
	height: 80px;
	font-size: 18px;
	text-shadow: 0 1px 0 rgb(0 0 0 / 40%);
	transition: box-shadow 0.15s ease, transform 0.15s ease;
}
.btn:hover {
	box-shadow: 0px 4px 8px rgb(45 35 66 / 40%),
		0px 7px 13px -3px rgb(45 35 66 / 30%), inset 0px -3px 30px #f700ff;
	transform: translateY(-2px);
}
.btn :active {
	box-shadow: inset 0px 3px 7px #000000;
	transform: translateY(2px);
}

#welcome {
	margin-top: 150px;
	font-size: 50px;
	text-shadow: 1px 1px #03ffc0;
	font-family: Stencil;
}
#login {
	text-decoration: none;
	font-weight: bold;
	color: black;
}
.about-text {
	font-size: 20px;
	text-align: center;
	text-shadow: 2px 2px black;
}

.about-container {
	background-color: rgba(49, 49, 49, 0.422);
	border-radius: 20px;
}

body {
	font-family: Stencil;
}
</style>

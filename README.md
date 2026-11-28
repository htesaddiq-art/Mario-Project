# Mario-Project
First Year University Project

# 1.Project Overview
The goal of this project is to create a solution to implement a the requirements presented to us. The requirements are listemd bellow.
1. Implement a tilemap for a level as an array of objects. It should load up at the start of the game and the camera should move when Mario does to show the next segmant of the level
2. Implement a movement system for Mario, allowing him to traverse through the level under the players control. Collision detection should also be used when Mario comes into contact with blocks and platforms.
3. Implement a boss fight at the end of the level. The boss should have different attacks and animations as well as sound effects.

We have decided who is doing what. Prahalath is doing movement, Rishad is doing the boss and Tesadiq is doing Tile set. We decided this in person.

To make the game as best as possible we have decided to focus on the boss battle. That allows us to fully implement the requirements to the best of out ability.

# Mario and Movement
For my part of the project, I will be focusing on Mario's design, movement and collision detection. I plan to use Piskel to create Mario's character design using the 32x32 scale that we agreed on as a group. I also want to create different sprites for when Mario is standing still, walking and jumping to make his movement look more natural.

For the movement, I will be using Java in Greenfoot to allow Mario to move left and right, as well as jump. I will also need to implement gravity and collision detection so that Mario can jump onto platforms without falling through them. Another part of my task is to make Mario take damage when he comes into contact with Bowser. However, this will be implemented and tested once my teammate has completed Bowser's design and behaviour.

I started by creating a separate project in Greenfoot to develop and test Mario's movement before integrating it into the main group project. I created a Mario class which inherits from the Actor class. I then implemented basic horizontal movement using the left and right arrow keys. I used a variable to control Mario's movement speed so that it can easily be adjusted during testing. I also decided to keep the movement logic in a separate method to make the code easier to read and maintain as I add more features.

After getting Mario's left and right movement working, I moved on to implementing jumping and gravity. I created separate methods for jumping and gravity to keep the code organised. I used variables for vertical velocity, gravity and jump strength so that I could easily adjust how Mario jumps.

I also introduced a boolean variable called onGround to prevent Mario from jumping again while he is already in the air. For initial testing, I used the bottom of the Greenfoot world as a temporary ground level. This allowed me to test Mario's jumping and gravity before implementing collision detection with the platforms designed by my teammate.

# Tile set
Using Piskel I was able to make a few different designs for the ground and platforms. I also made some designs for pipes and bricks, although I might not use all of them. There was a bit of trial and error when it came to making the pipes. I had to make sure it fit in the 32x32 scale that we chose as a group. I struggled with giving the illusion that the top of the pipe was thicker and open. A solution I found was to make the sides of the pipe in the pipe_base.png slimmer so that in the pipe_top.png I could use the new extra space to make the pipe thicker.

# Boss

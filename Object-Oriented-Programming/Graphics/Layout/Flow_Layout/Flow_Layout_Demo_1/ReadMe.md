# Java_21_FLow_Layout_Demo_1

## Overview:

This Java Swing application demonstrates the use of the FlowLayout manager to align components (buttons) in different positions within a container.

The layout aligns components in a left-to-right flow, much like lines of text in a paragraph.

This demo allows the user to switch between left, center, and right alignments dynamically through the use of buttons.

## Features:

FlowLayout is used to arrange components (buttons) in the container.

Dynamic switching of alignment between left, center, and right using buttons.

Simple user interface with three buttons to demonstrate how FlowLayout works.

## Components Used:

JFrame: The main window container where the components are placed.

JButton: Three buttons labeled "Left", "Center", and "Right" are added to the frame, each controlling the alignment of components.

FlowLayout: The layout manager used to arrange components in the container. It allows the flow and alignment of components.

ActionListener: Anonymous inner classes handle button click events to adjust the layout alignment.

## How it works:

1 - FlowLayout:

The layout manager arranges the components in a left-to-right flow.

The default alignment can be changed by clicking one of the buttons (Left, Center, Right).

2 - Buttons and Listeners:

Each button has a listener that changes the alignment when clicked:

Left Button: Aligns the components to the left.

Center Button: Centers the components.

Right Button: Aligns the components to the right.

When a button is clicked, the *setAlignment()* method of FlowLayout is called, followed by *layoutContainer()* to update the alignment of the components.

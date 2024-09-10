# Java_21_Multiple_Selection_1

## Overview:
This Java program allows users to select multiple colors from a list and copy the selected colors to another list using a button.

It demonstrates the usage of JList with multiple selection and how to transfer data between lists within a graphical user interface (GUI) built using Swing.

## Features:

Select multiple items from a list of color names.

Copy selected items from the first list to a second list by clicking a button.

Handles multiple item selections using MULTIPLE_INTERVAL_SELECTION.

## Components used:

JList: Displays color names and copies selected items to another list.

JButton: Triggers the action to copy selected items.

Container: Manages the layout of the GUI components.

ActionListener: Handles the button click event to copy selected items.

## How it works:

The first JList (colorList) displays a list of color names.

The user selects multiple colors from this list.

When the "Copy >>>" button is clicked, an ActionListener is triggered.

The selected colors are copied from colorList to the second JList (copyList), updating the second list with the selected values.

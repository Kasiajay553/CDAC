package com.day2.task_3;

public class Task3Driver {

	public static void main(String[] args) {
		System.out.println("=== TASK 3: IN-PLACE REVERSAL VERIFICATION ===");
		Playlist playlist = new Playlist();
		playlist.addTrack("Track 1 - Intro");
		playlist.addTrack("Track 2 - Verse");
		playlist.addTrack("Track 3 - Chorus");
		playlist.addTrack("Track 4 - Outro");
		System.out.print("Original Playlist: ");
		playlist.display();
		// Reverse in-place
		playlist.reverse();
		System.out.print("Reversed Playlist: ");
		playlist.display();
		// Verify head and tail pointers are intact by appending a new track
		playlist.addTrack("Track 5 - Bonus");
		System.out.print("After Appending Track 5: ");
		playlist.display();

	}

}

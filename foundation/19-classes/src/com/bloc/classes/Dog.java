package com.bloc.classes;

class Dog {
    // The length of hair which
    final float HAIR_CUT_LENGTH = 0.15f;
    // Minimum weight that any Dog can be
    final float MIN_WEIGHT = 1.25f;
	// Amount of weight to gain after eating
	final float WEIGHT_GAIN = 0.25f;
	// Amount of weight to lose after playing
	final float WEIGHT_LOSS = 0.2f;
	// Hair length
	float mHairLength;
	// Gender, either "male" or "female"
	String mGender;
	// Size, either "tiny", "small", "average", or "large"
	String mSize;
	// Its age
	int mAge;
	// Its weight in pounds
	float mWeight;
	// The color of its coat
	String mColor;
	// How many Meals
	int mMeals;
	// How many Plays
	int mPlays;
	

	/************************************************
	 * ADD MEMBER VARIABLES HERE IF NECESSARY	
	/************************************************/


	/*
	 * getHairLength
	 *
	 * @return this Dog's hair length (float)
	 */
	

	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the getHairLength method
	/************************************************/
	float getHairLength(){
		return mHairLength;
	}

	/*
	 * setHairLength
	 *
	 * Sets the length of the Dog's hair (float)
	 *
	 * @param hairLength the new length of the hair (float)
	 * @return nothing
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the setHairLength method
	/************************************************/
	void setHairLength(float hairLength){
		mHairLength=hairLength;
	}

	/*
	 * getGender
	 *
	 * @return this Dog's gender (String)
	 */
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION
	String getGender(){
		return mGender;
	}

	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the getGender method
	/************************************************/

	/*
	 * setGender
	 *
	 * Sets this Dog's gender
	 *
	 * @param gender the new gender of the Dog (String)
	 * @return nothing
	 */
	void setGender(String gender){
		mGender =gender;
	}
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the setGender method
	/************************************************/

	/*
	 * getSize
	 *
	 * @return the size of the dog (String)
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the getSize method
	/************************************************/
	String getSize(){
		return mSize;
	}

	/*
	 * setSize
	 *
	 * Sets the size of the Dog
	 *
	 * @param size the new size of the Dog (String)
	 * @return nothing
	 */
	void setSize(String size){
		mSize=size;
	}
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the setSize method
	/************************************************/

	/*
	 * getAge
	 *
	 * @return this Dog's age (int)
	 */
	int getAge(){
		return mAge;
	}
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the getAge method
	/************************************************/

	/*
	 * setAge
	 *
	 * Sets the age of the Dog
	 *
	 * @param age the new age of the Dog (int)
	 * @return nothing
	 */
	void setAge(int age){
		mAge = age;
	}
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the setAge method
	/************************************************/

	/*
	 * getWeight
	 *
	 * @return this Dog's weight (float)
	 */
	float getWeight(){
		return mWeight;
	}
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the getWeight method
	/************************************************/

	/*
	 * setWeight
	 *
	 * Sets the weight of the Dog
	 *
	 * @param weight the new weight of the Dog (float)
	 * @return nothing
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the setWeight method
	/************************************************/
	void setWeight(float weight){
		mWeight = weight;
	}

	/*
	 * getColor
	 *
	 * @return this Dog's color (String)
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the getColor method
	/************************************************/
	String getColor(){
		return mColor;
	}

	/*
	 * setColor
	 *
	 * Sets the color of the Dog
	 *
	 * @param color the new color of the Dog's coat (String)
	 * @return nothing
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the setColor method
	/************************************************/
	void setColor(String getColor){
		mColor = getColor;
	}

	/*
	 * feed
	 *
	 * Feeds the Dog.
	 *
	 * Side-effect: 1. The Dog gains weight, specifically WEIGHT_GAIN
	 *              2. Every 3 meals, the Dog grows to a larger size, if
	 *                 possible
	 *                 i.e. "tiny" (3 meals later ->) "small" (3 meals later ->)
	 *                 "average" (3 meals later ->) "large"
	 *				   the Dog cannot exceed the "large" size or shrink smaller than
	 *				   "tiny"
	 * @return nothing
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the feed method
	/************************************************/
	void feed() {
		mMeals++;

		//increase the dog's weight and insert it into the weight variable
		mWeight = WEIGHT_GAIN*MIN_WEIGHT;
		
		// check if you can increase the dog's size by checking if the dog is "large"
		if (mSize == large) {
			mSize = null;
			
		// check if this is a third meal
		// if it is
			// increase the dog's size		
			} else if (mMeals >= 3 & mSize == tiny) {
				mSize = small;
			
			} else if (mMeals >= 3 & mSize == small) {
				mSize = average;

			} else if (mMeals >= 3 & mSize == average) {
				mSize = large;

			} else if (mSize < tiny) {
				mSize = null;
			}
		}	// if it is
			// if it isn't 
					// do nothing
		// if it isn't
			// do nothing
			
	/*
	 * play
	 *
	 * Let the Dog play.
	 *
	 * Side-effect: 1. The Dog loses weight, specifically WEIGHT_LOSS
	 *				2. Every 6 play invocations, the Dog shrinks to a smaller 
	 *		   		   size, if possible i.e. "large" (6 plays later->) "average" (6 plays later->) 
	 *		   		   "small" -> "tiny"
	 *		   		3. The Dog cannot shrink to a weight smaller than
	 *		  		   MIN_WEIGHT
	 * @return nothing
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the play method
	/************************************************/
	void play() {
		mPlays++;
		mWeight = WEIGHT_LOSS*MIN_WEIGHT;
			
		if (mSize <= MIN_WEIGHT) {
			mSize = null;
			
			
		} else if (mPlays >= 6 & mSize == large) {
				mSize = average;
			
		} else if (mPlays >= 6 & mSize == average) {
				mSize = small;

		} else if (mPlays >= 6 & mSize == small) {
				mSize = tiny;

		} else if (mSize < tiny) {
				mSize = null;
		}
	}

	/*
	 * cutHair
	 *
	 * Cut the Dog's hair.
	 *
	 * Side-effect: the Dog's hair length is reduced by HAIR_CUT_LENGTH
	 * 				The Dog's hair cannot be shorter than 0f
	 *
	 * @return nothing
	 */
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the cutHair method
	/************************************************/
	void cutHair () {
		
		mHairLength = mHairLength * HAIR_CUT_LENGTH;
	}

}

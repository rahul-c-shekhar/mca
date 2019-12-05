# -*- coding: utf-8 -*-
"""
Created on Wed Apr 24 14:40:49 2019

@author: rahul
"""

import pymongo
from pymongo import MongoClient

con = pymongo.MongoClient("mongodb://localhost")
db = con.pes
coll = db.Movie

def insert() :
    movieTitle = input("Enter title : ")
    movieWriter = input("Enter writer : ")
    movieYear = int(input("Enter year : "))
    movieFranchise = input("Enter franchise : ")
    movieHero = input("Enter hero : ")
    movieHeroine = input("Enter heroine : ")
    coll.insert_one({
        "title" : movieTitle,
        "writer" : movieWriter,
        "year" : movieYear,
        "franchise" : movieFranchise,
        "actors" : {
            "hero" : movieHero,
            "heroine" : movieHeroine
        }
    })
    
def find1() :
    for i in coll.find({"writer" : "Quentin Tarantino"},{"_id" : 0}) :
        print(i)   

def find2() :
    for j in coll.find({"actors.hero":"Brad Pitt"},{"_id":0}) :
        print(j)
        
def find3() :
    for k in coll.find({"franchise":"Harry Potter"},{"_id":0}) :
        print(k)
    
n  = input("Enter the number of documents : ")

for i in range(0, int(n)) :
    insert()
  
find1()
'''
{'writer': 'Quentin Tarantino', 'title': 'Once Upon A Time In Hollywood', 'year': 2018, 'actors': {'hero': 'Leonardo Di Caprio', 'heroine': 'Margot Robbie'}, 'franchise': 'Hollywood'}
'''
find2()
'''
{'writer': 'Steven Soderbergh', 'title': "Ocean's 11", 'year': 2011, 'actors': {'hero': 'Brad Pitt', 'heroine': 'Angelina Jolie'}, 'franchise': 'OCeans'}
'''
find3()
'''
{'writer': 'J K Rowling', 'title': 'Harry Potter and The Order of Phoenix', 'year': 2007, 'actors': {'hero': 'Daniel Radcliff', 'heroine': 'Emma Watson'}, 'franchise': 'Harry Potter'}
'''
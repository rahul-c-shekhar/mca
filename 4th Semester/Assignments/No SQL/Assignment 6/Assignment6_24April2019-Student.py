# -*- coding: utf-8 -*-
"""
Created on Wed Apr 24 13:49:01 2019

@author: rahul
"""

import pymongo
from pymongo import MongoClient

con = pymongo.MongoClient("mongodb://localhost")
db = con.pes
coll = db.Student

def insert() :
    studentSRN = input("Enter SRN : ")
    studentName = input("Enter name : ")
    studentSem = int(input("Enter sem : "))
    studentClass = input("Enter class : ")
    studentISA = int(input("Enter ISA : "))
    studentCAType = input("Enter CA type : ")
    studentCAMarks = int(input("Enter marks : "))
    coll.insert_one({
        "srn" : studentSRN,
        "name" : studentName,
        "sem" : studentSem,
        "class" : studentClass,
        "isa" : studentISA,
        "ca" : {
            "type" : studentCAType,
            "marks" : studentCAMarks
        }
    })
    
def find() :
    for i in coll.find({"ca.type":"Quiz","ca.marks":{"$gt":10}},{"_id":0}) :
        print(i)

        
def sort() :
    for i in coll.aggregate([
        { "$sort" : {"isa" : 1, "ca.marks" : 1}}    
    ]) :
        print(i)

def update() :
    coll.update_many({},{"$inc":{"sem":1}})
    for i in coll.find() :
        print(i)
        
n  = input("Enter the number of documents : ")

for i in range(0, int(n)) :
    insert()

find()
'''
{'sem': 4, 'class': 'MCA', 'srn': 'PES1201802486', 'ca': {'type': 'Quiz', 'marks': 18}, 'name': 'Rahul C Shekhar', 'isa': 2}
{'sem': 4, 'class': 'MCA', 'srn': 'PES1201802128', 'ca': {'type': 'Quiz', 'marks': 15}, 'name': 'Vaidehi', 'isa': 2}
{'sem': 3, 'class': 'MCA', 'srn': 'PES1201802449', 'ca': {'type': 'Quiz', 'marks': 16}, 'name': 'Akshita', 'isa': 2}
{'sem': 3, 'class': 'MCA', 'srn': 'PES1201802445', 'ca': {'type': 'Quiz', 'marks': 12}, 'name': 'Sahana', 'isa': 2}
{'sem': 4, 'class': 'MCA', 'srn': 'PES1201702457', 'ca': {'type': 'Quiz', 'marks': 17}, 'name': 'Sampada', 'isa': 2}
{'sem': 4, 'class': 'MCA', 'srn': 'PES12018027474', 'ca': {'type': 'Quiz', 'marks': 12}, 'name': 'Atul', 'isa': 2}
{'sem': 4, 'class': 'MCA', 'srn': 'PES1201802454', 'ca': {'type': 'Quiz', 'marks': 13}, 'name': 'Harshit', 'isa': 2}
{'class': 'MCA', 'sem': 4, 'isa': 2, 'ca': {'type': 'Quiz', 'marks': 12}, 'srn': 'PES1201802222', 'name': 'Chinmay'}
'''
sort()
'''
{'class': 'MCA', 'sem': 4, 'isa': 2, 'ca': {'type': 'Quiz', 'marks': 8}, 'srn': 'PES1201702124', '_id': ObjectId('5cc022c3eeefcc0b5b0638e8'), 'name': 'Chirag'}
{'class': 'MCA', 'sem': 4, 'isa': 2, 'ca': {'type': 'Quiz', 'marks': 10}, 'srn': 'PES1201802121', '_id': ObjectId('5cc02285eeefcc0b5b0638e7'), 'name': 'Suraj'}
{'sem': 3, 'class': 'MCA', 'srn': 'PES1201802445', 'ca': {'type': 'Quiz', 'marks': 12}, 'name': 'Sahana', '_id': ObjectId('5cc01f3aeeefcc0b620c1774'), 'isa': 2}
{'sem': 4, 'class': 'MCA', 'srn': 'PES12018027474', 'ca': {'type': 'Quiz', 'marks': 12}, 'name': 'Atul', '_id': ObjectId('5cc02038eeefcc0d3b5fe1f9'), 'isa': 2}
{'class': 'MCA', 'sem': 4, 'isa': 2, 'ca': {'type': 'Quiz', 'marks': 12}, 'srn': 'PES1201802222', '_id': ObjectId('5cc022d9eeefcc0b5b0638e9'), 'name': 'Chinmay'}
{'sem': 4, 'class': 'MCA', 'srn': 'PES1201802454', 'ca': {'type': 'Quiz', 'marks': 13}, 'name': 'Harshit', '_id': ObjectId('5cc02058eeefcc0d3b5fe1fa'), 'isa': 2}
{'sem': 4, 'class': 'MCA', 'srn': 'PES1201802128', 'ca': {'type': 'Quiz', 'marks': 15}, 'name': 'Vaidehi', '_id': ObjectId('5cc01effeeefcc0b620c1772'), 'isa': 2}
{'sem': 3, 'class': 'MCA', 'srn': 'PES1201802449', 'ca': {'type': 'Quiz', 'marks': 16}, 'name': 'Akshita', '_id': ObjectId('5cc01f1eeeefcc0b620c1773'), 'isa': 2}
{'sem': 4, 'class': 'MCA', 'srn': 'PES1201702457', 'ca': {'type': 'Quiz', 'marks': 17}, 'name': 'Sampada', '_id': ObjectId('5cc01f5ceeefcc0b620c1775'), 'isa': 2}
{'sem': 4, 'class': 'MCA', 'srn': 'PES1201802486', 'ca': {'type': 'Quiz', 'marks': 18}, 'name': 'Rahul C Shekhar', '_id': ObjectId('5cc01edbeeefcc0b620c1771'), 'isa': 2}
'''
update()
'''
{'sem': 5, 'class': 'MCA', 'srn': 'PES1201802486', 'ca': {'type': 'Quiz', 'marks': 18}, 'name': 'Rahul C Shekhar', '_id': ObjectId('5cc01edbeeefcc0b620c1771'), 'isa': 2}
{'sem': 5, 'class': 'MCA', 'srn': 'PES1201802128', 'ca': {'type': 'Quiz', 'marks': 15}, 'name': 'Vaidehi', '_id': ObjectId('5cc01effeeefcc0b620c1772'), 'isa': 2}
{'sem': 4, 'class': 'MCA', 'srn': 'PES1201802449', 'ca': {'type': 'Quiz', 'marks': 16}, 'name': 'Akshita', '_id': ObjectId('5cc01f1eeeefcc0b620c1773'), 'isa': 2}
{'sem': 4, 'class': 'MCA', 'srn': 'PES1201802445', 'ca': {'type': 'Quiz', 'marks': 12}, 'name': 'Sahana', '_id': ObjectId('5cc01f3aeeefcc0b620c1774'), 'isa': 2}
{'sem': 5, 'class': 'MCA', 'srn': 'PES1201702457', 'ca': {'type': 'Quiz', 'marks': 17}, 'name': 'Sampada', '_id': ObjectId('5cc01f5ceeefcc0b620c1775'), 'isa': 2}
{'sem': 5, 'class': 'MCA', 'srn': 'PES12018027474', 'ca': {'type': 'Quiz', 'marks': 12}, 'name': 'Atul', '_id': ObjectId('5cc02038eeefcc0d3b5fe1f9'), 'isa': 2}
{'sem': 5, 'class': 'MCA', 'srn': 'PES1201802454', 'ca': {'type': 'Quiz', 'marks': 13}, 'name': 'Harshit', '_id': ObjectId('5cc02058eeefcc0d3b5fe1fa'), 'isa': 2}
{'class': 'MCA', 'sem': 5, 'isa': 2, 'ca': {'type': 'Quiz', 'marks': 10}, 'srn': 'PES1201802121', '_id': ObjectId('5cc02285eeefcc0b5b0638e7'), 'name': 'Suraj'}
{'class': 'MCA', 'sem': 5, 'isa': 2, 'ca': {'type': 'Quiz', 'marks': 8}, 'srn': 'PES1201702124', '_id': ObjectId('5cc022c3eeefcc0b5b0638e8'), 'name': 'Chirag'}
{'class': 'MCA', 'sem': 5, 'isa': 2, 'ca': {'type': 'Quiz', 'marks': 12}, 'srn': 'PES1201802222', '_id': ObjectId('5cc022d9eeefcc0b5b0638e9'), 'name': 'Chinmay'}
'''
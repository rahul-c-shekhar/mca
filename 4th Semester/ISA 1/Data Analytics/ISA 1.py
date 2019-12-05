#!/usr/bin/env python
# coding: utf-8

# In[37]:


import numpy as np
import pandas as pd
import matplotlib.pyplot as plt

from sklearn import linear_model
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression
from sklearn.metrics import mean_squared_error


# In[12]:


ds = pd.read_csv('cars.csv')


# In[13]:


ds.head()


# In[14]:


ds.describe()


# In[15]:


plt.scatter(ds['wt'], ds['hp'])
plt.show()


# In[17]:


X = ds['hp']
y = ds['wt']


# In[18]:


X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.3, random_state=0)


# In[19]:


regressor = LinearRegression()
regressor.fit(np.array(X_train).reshape(-1, 1), np.array(y_train).reshape(-1, 1))


# In[27]:


y_pred = regressor.predict(np.array(X_test).reshape(-1, 1))


# In[28]:


y_pred[:10]


# In[38]:


mean_squared_error(y_pred, y_test)


# In[ ]:





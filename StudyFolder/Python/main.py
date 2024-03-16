# operation = 'reboot'


# if operation == 'start' or 'reboot':
#     print('yep')

# name = {
#     "marry": {"age":30,"height":"5 feet 3 inches"}, "john": {"age": 40,"height":"6feet 1 inch"}

# }

# print(name['marry']['age'])


# def my_func():
#     print("hello you there")


# my_func()


import pydot

(graph,) = pydot.graph_from_dot_file('graph.dot')
graph.write_png('somefile.png')
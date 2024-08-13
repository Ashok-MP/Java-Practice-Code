class BinaryTree:
node.right =newNode
def createBinary(self):
    rootData = int(input("Enter the root data: "))
    self.createROOt(rootData)
    q= Queue()
    q.put(self.root)
    while(len(q.queue)!-0):
          currNode=q.get()
          print("enter left child's data of",currNode.data)
          leftData = int(input())
          print("enter right child's data of",currNode.data)
          rightData = int(input())
          if(leftData!=-1):
          leftchild = Node(leftData)
          currNode.left=leftchild
          q.put(leftchild)
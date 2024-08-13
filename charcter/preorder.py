def preOrder(self,Node):
    if(node==None):
        return
    print(node.data,end="")
    self.preorder(node.left)
    self.preorder(node.right)
    pass
def postorder(self,Node):
    if(node==None):
        return
    self.postorder(node.right)
    print(node.date,end="")
    self.postorder(node.left)
package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akga extends defpackage.akge {
    private int c;
    private int d;
    private java.nio.ByteBuffer e;
    private java.nio.ByteBuffer f;
    private java.lang.String[] g;

    private static int e(java.nio.ByteBuffer byteBuffer, int i, int i2) {
        int i3 = i2 * i;
        return i == 2 ? byteBuffer.getShort(i3) : byteBuffer.getInt(i3);
    }

    private static void f(java.io.ObjectInput objectInput, int i, java.nio.ByteBuffer byteBuffer, int i2) {
        int i3 = i2 * i;
        if (i == 2) {
            byteBuffer.putShort(i3, objectInput.readShort());
        } else {
            byteBuffer.putInt(i3, objectInput.readInt());
        }
    }

    private static void g(java.io.ObjectOutput objectOutput, int i, java.nio.ByteBuffer byteBuffer, int i2) {
        int i3 = i2 * i;
        if (i == 2) {
            objectOutput.writeShort(byteBuffer.getShort(i3));
        } else {
            objectOutput.writeInt(byteBuffer.getInt(i3));
        }
    }

    @Override // defpackage.akge
    public final int a(int i) {
        return e(this.e, this.c, i);
    }

    @Override // defpackage.akge
    public final java.lang.String b(int i) {
        return this.g[e(this.f, this.d, i)];
    }

    @Override // defpackage.akge
    public final void c(java.io.ObjectInput objectInput) {
        this.c = objectInput.readInt();
        this.d = objectInput.readInt();
        java.util.TreeSet treeSet = this.b;
        int i = objectInput.readInt();
        treeSet.clear();
        for (int i2 = 0; i2 < i; i2++) {
            treeSet.add(java.lang.Integer.valueOf(objectInput.readInt()));
        }
        int i3 = objectInput.readInt();
        java.lang.String[] strArr = this.g;
        if (strArr == null || strArr.length < i3) {
            this.g = new java.lang.String[i3];
        }
        for (int i4 = 0; i4 < i3; i4++) {
            this.g[i4] = objectInput.readUTF();
        }
        int i5 = objectInput.readInt();
        this.a = i5;
        java.nio.ByteBuffer byteBuffer = this.e;
        if (byteBuffer != null) {
            int iCapacity = byteBuffer.capacity();
            int i6 = this.a;
            if (iCapacity < i6) {
                i5 = i6;
                this.e = java.nio.ByteBuffer.allocate(i5 * this.c);
            }
        } else {
            this.e = java.nio.ByteBuffer.allocate(i5 * this.c);
        }
        java.nio.ByteBuffer byteBuffer2 = this.f;
        if (byteBuffer2 == null || byteBuffer2.capacity() < this.a) {
            this.f = java.nio.ByteBuffer.allocate(this.a * this.d);
        }
        for (int i7 = 0; i7 < this.a; i7++) {
            f(objectInput, this.c, this.e, i7);
            f(objectInput, this.d, this.f, i7);
        }
    }

    @Override // defpackage.akge
    public final void d(java.io.ObjectOutput objectOutput) {
        objectOutput.writeInt(this.c);
        objectOutput.writeInt(this.d);
        java.util.TreeSet treeSet = this.b;
        objectOutput.writeInt(treeSet.size());
        java.util.Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            objectOutput.writeInt(((java.lang.Integer) it.next()).intValue());
        }
        objectOutput.writeInt(this.g.length);
        for (java.lang.String str : this.g) {
            objectOutput.writeUTF(str);
        }
        objectOutput.writeInt(this.a);
        for (int i = 0; i < this.a; i++) {
            g(objectOutput, this.c, this.e, i);
            g(objectOutput, this.d, this.f, i);
        }
    }
}

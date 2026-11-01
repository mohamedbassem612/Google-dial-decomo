package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akfz extends defpackage.akge {
    private int[] c;
    private java.lang.String[] d;

    @Override // defpackage.akge
    public final int a(int i) {
        return this.c[i];
    }

    @Override // defpackage.akge
    public final java.lang.String b(int i) {
        return this.d[i];
    }

    @Override // defpackage.akge
    public final void c(java.io.ObjectInput objectInput) {
        int i = objectInput.readInt();
        this.a = i;
        int[] iArr = this.c;
        if (iArr == null || iArr.length < i) {
            this.c = new int[i];
        }
        java.lang.String[] strArr = this.d;
        if (strArr == null || strArr.length < i) {
            this.d = new java.lang.String[i];
        }
        for (int i2 = 0; i2 < this.a; i2++) {
            this.c[i2] = objectInput.readInt();
            this.d[i2] = objectInput.readUTF();
        }
        int i3 = objectInput.readInt();
        java.util.TreeSet treeSet = this.b;
        treeSet.clear();
        for (int i4 = 0; i4 < i3; i4++) {
            treeSet.add(java.lang.Integer.valueOf(objectInput.readInt()));
        }
    }

    @Override // defpackage.akge
    public final void d(java.io.ObjectOutput objectOutput) {
        objectOutput.writeInt(this.a);
        for (int i = 0; i < this.a; i++) {
            objectOutput.writeInt(this.c[i]);
            objectOutput.writeUTF(this.d[i]);
        }
        java.util.TreeSet treeSet = this.b;
        objectOutput.writeInt(treeSet.size());
        java.util.Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            objectOutput.writeInt(((java.lang.Integer) it.next()).intValue());
        }
    }
}

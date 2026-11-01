package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aicv extends defpackage.aida implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    public transient defpackage.aijx a = g();
    public transient long b;

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        this.a = g();
        for (int i2 = 0; i2 < i; i2++) {
            a(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(j().size());
        for (aijp aijpVar : j()) {
            objectOutputStream.writeObject(aijpVar.a);
            objectOutputStream.writeInt(aijpVar.a());
        }
    }

    @Override // defpackage.aida, defpackage.aijo
    public final int a(java.lang.Object obj, int i) {
        if (i == 0) {
            return b(obj);
        }
        defpackage.ahvr.bP(i > 0, "occurrences cannot be negative: %s", i);
        int iD = this.a.d(obj);
        long j = i;
        defpackage.aijx aijxVar = this.a;
        if (iD == -1) {
            aijxVar.f(obj, i);
            this.b += j;
            return 0;
        }
        int iC = aijxVar.c(iD);
        long j2 = ((long) iC) + j;
        defpackage.ahvr.bQ(j2 <= 2147483647L, "too many occurrences: %s", j2);
        this.a.n(iD, (int) j2);
        this.b += j;
        return iC;
    }

    @Override // defpackage.aijo
    public final int b(java.lang.Object obj) {
        return this.a.b(obj);
    }

    @Override // defpackage.aida
    public final int c() {
        return this.a.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        defpackage.aijx aijxVar = this.a;
        aijxVar.d++;
        java.util.Arrays.fill(aijxVar.a, 0, aijxVar.c, (java.lang.Object) null);
        java.util.Arrays.fill(aijxVar.b, 0, aijxVar.c, 0);
        java.util.Arrays.fill(aijxVar.e, -1);
        java.util.Arrays.fill(aijxVar.f, -1L);
        aijxVar.c = 0;
        this.b = 0L;
    }

    @Override // defpackage.aida, defpackage.aijo
    public final int d(java.lang.Object obj, int i) {
        defpackage.ahvr.bP(true, "occurrences cannot be negative: %s", i);
        int iD = this.a.d(obj);
        if (iD == -1) {
            return 0;
        }
        int iC = this.a.c(iD);
        defpackage.aijx aijxVar = this.a;
        if (iC > i) {
            aijxVar.n(iD, iC - i);
        } else {
            aijxVar.h(iD);
            i = iC;
        }
        this.b -= (long) i;
        return iC;
    }

    @Override // defpackage.aida
    public final java.util.Iterator e() {
        return new aics(this);
    }

    @Override // defpackage.aida
    public final java.util.Iterator f() {
        return new aict(this);
    }

    public abstract defpackage.aijx g();

    @Override // defpackage.aida, defpackage.aijo
    public final boolean h(java.lang.Object obj, int i) {
        defpackage.ahvr.bC(i, "oldCount");
        int iD = this.a.d(obj);
        if (iD == -1) {
            if (i != 0) {
                return false;
            }
        } else {
            if (this.a.c(iD) != i) {
                return false;
            }
            this.a.h(iD);
            this.b -= (long) i;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, defpackage.aijo
    public final java.util.Iterator iterator() {
        return new aijs(this, j().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.aijo
    public final int size() {
        return defpackage.aiql.T(this.b);
    }
}

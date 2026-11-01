package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class aojl implements java.util.Iterator, defpackage.aoow {
    public int a;
    final /* synthetic */ defpackage.aojo b;

    public aojl(defpackage.aojo aojoVar) {
        this.b = aojoVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.a();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        defpackage.aojo aojoVar = this.b;
        int i = this.a;
        this.a = i + 1;
        return aojoVar.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        defpackage.a.am();
    }
}

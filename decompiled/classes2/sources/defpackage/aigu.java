package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aigu extends ailj {
    int a;
    java.lang.Object b;
    final /* synthetic */ java.util.Iterator c;

    public aigu(aigy aigyVar, java.util.Iterator it) {
        this.c = it;
        j$.util.Objects.requireNonNull(aigyVar);
    }

    public final boolean hasNext() {
        return this.a > 0 || this.c.hasNext();
    }

    public final java.lang.Object next() {
        int iA = this.a;
        if (iA <= 0) {
            defpackage.aijp aijpVar = (defpackage.aijp) this.c.next();
            this.b = aijpVar.a;
            iA = aijpVar.a();
        }
        this.a = iA - 1;
        return j$.util.Objects.requireNonNull(this.b);
    }
}

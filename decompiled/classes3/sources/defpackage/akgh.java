package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akgh {
    int a;
    final /* synthetic */ java.lang.Object b;

    public akgh(defpackage.acna acnaVar) {
        j$.util.Objects.requireNonNull(acnaVar);
        this.b = acnaVar;
        this.a = -1;
    }

    public final int a(int i) {
        return ((defpackage.akgi) this.b).a[this.a + i] & 255;
    }

    public final int b() {
        int i = this.a;
        this.a = i + 1;
        return ((defpackage.akgi) this.b).a[i] & 255;
    }

    public final int c() {
        return (b() << 8) | b();
    }

    public final int d(int i) {
        this.a += i;
        return i != 0 ? 1 : 2;
    }

    public final int e(int i) {
        return d(a(i));
    }

    public final void f(defpackage.acmd acmdVar) {
        ahvr.bY(acmdVar.b());
        akzz akzzVar = acmdVar.c;
        aiwc aiwcVar = akzzVar.b.d;
        if (aiwcVar == null) {
            aiwcVar = aiwc.a;
        }
        ahvr.bY((aiwcVar.b & 2048) != 0);
        int iAS = a.aS(akzzVar.b.e);
        if (iAS == 0 || iAS == 1) {
            defpackage.acna acnaVar = (defpackage.acna) this.b;
            java.util.List list = acnaVar.e;
            int size = list.size();
            list.add(acmdVar.a());
            acnaVar.f.put(size, this.a);
            int i = this.a;
            this.a = size;
            acmdVar.a.q(this);
            this.a = i;
        }
    }

    public akgh(defpackage.akgi akgiVar) {
        j$.util.Objects.requireNonNull(akgiVar);
        this.b = akgiVar;
        this.a = 0;
    }
}

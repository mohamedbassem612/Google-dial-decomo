package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class agx {
    public final java.lang.Object a;
    public final ahj b;
    public boolean e;
    public final defpackage.aho c = new defpackage.aho(this);
    public final adq g = new adq(16);
    private final ccp h = new androidx.compose.runtime.ParcelableSnapshotMutableState(aokc.a, cdu.c);
    public final aii d = new aii(new cpm(0), alo.f, (java.lang.Object) null, "Animatable");
    public final aomy f = new defpackage.mq(this, 3);

    public agx(java.lang.Object obj, ahj ahjVar) {
        this.a = obj;
        this.b = ahjVar;
    }

    public final defpackage.ahn a() {
        return this.c.a();
    }

    public final java.util.List b() {
        return (java.util.List) this.h.a();
    }

    public final void c() {
        this.c.c();
    }

    public final void d() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        adq adqVar = this.g;
        java.lang.Object[] objArr = adqVar.a;
        int i = adqVar.b;
        boolean z = false;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.agy agyVar = (defpackage.agy) objArr[i2];
            if (agyVar.r()) {
                arrayList.add(agyVar);
                if (agyVar.d().e()) {
                    z = true;
                }
            }
        }
        this.h.b(arrayList);
        defpackage.aho ahoVar = this.c;
        if (ahoVar.b().size() > 1 && z) {
            ahoVar.g(2);
        } else if (!ahoVar.a.b.i()) {
            ahoVar.e();
        } else if (!z) {
            ahoVar.g(3);
        }
        ahoVar.c();
        java.lang.Object[] objArr2 = adqVar.a;
        int i3 = adqVar.b;
        for (int i4 = 0; i4 < i3; i4++) {
            ((defpackage.agy) objArr2[i4]).n();
        }
    }

    public final boolean e() {
        return a().i();
    }

    public final boolean f() {
        return a().e() || a().i() || this.c.c == 2;
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afoo {
    public final defpackage.afof a;
    public final defpackage.afof b;
    public final defpackage.afof c;
    public final aoss d;
    public boolean e;
    public defpackage.afoe f;
    public defpackage.afoe g;
    public defpackage.afoe h;
    public final aozh i;
    private final boolean j;
    private final aozj k;

    public afoo(defpackage.afof afofVar, defpackage.afof afofVar2, defpackage.afof afofVar3, boolean z, aoss aossVar) {
        aooh.f(aossVar, "coroutineScope");
        this.a = afofVar;
        this.b = afofVar2;
        this.c = afofVar3;
        this.j = z;
        this.d = aossVar;
        aozj aozjVarA = aozk.a(new defpackage.afol(afsq.k(), afsq.k(), afsq.k()));
        this.k = aozjVarA;
        this.i = new aoys(aozjVarA, (aoub) null);
    }

    public final void a() {
        if (this.e) {
            return;
        }
        this.e = true;
        if (this.j) {
            aoov.an(this.d, (aolr) null, 0, new defpackage.adzb(this, (aoln) null, 6, (byte[]) null), 3);
        }
        aoss aossVar = this.d;
        aoov.an(aossVar, (aolr) null, 0, new defpackage.adzb(this, (aoln) null, 7, (char[]) null), 3);
        aoov.an(aossVar, (aolr) null, 0, new defpackage.adzb(this, (aoln) null, 8, (short[]) null), 3);
    }

    public final void b() {
        boolean z = this.j;
        defpackage.afoe afoeVar = this.f;
        defpackage.afoe afoeVar2 = this.g;
        defpackage.afoe afoeVar3 = this.h;
        if (!z && afoeVar2 != null && afoeVar3 != null) {
            this.k.e(new defpackage.afol(afsq.k(), afoeVar2, afoeVar3));
            this.e = false;
        } else {
            if (!z || afoeVar == null || afoeVar2 == null || afoeVar3 == null) {
                return;
            }
            this.k.e(new defpackage.afol(afoeVar, afoeVar2, afoeVar3));
            this.e = false;
        }
    }
}

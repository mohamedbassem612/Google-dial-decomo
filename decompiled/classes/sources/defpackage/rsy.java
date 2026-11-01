package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rsy {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/marquee/impl/service/MarqueeDao");
    public final defpackage.ecx b;
    public final defpackage.aolr c;

    public rsy(defpackage.ecx ecxVar, defpackage.aolr aolrVar) {
        if (ecxVar == null) {
            defpackage.aooh.i("marqueeStorageData");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("lightweightContext");
        }
        this.b = ecxVar;
        this.c = aolrVar;
    }

    public final java.lang.Object a(defpackage.rsd rsdVar, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.c, new rka(this, rsdVar, (defpackage.aoln) null, 4), aolnVar);
    }

    public final java.lang.Object b(defpackage.rsd rsdVar, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.c, new rka(this, rsdVar, (defpackage.aoln) null, 6, (char[]) null), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.rsd rsdVar, int i, defpackage.aoln aolnVar) {
        rsv rsvVar;
        if (aolnVar instanceof rsv) {
            rsvVar = (rsv) aolnVar;
            int i2 = rsvVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rsvVar.c = i2 - Integer.MIN_VALUE;
            } else {
                rsvVar = new rsv(this, aolnVar);
            }
        } else {
            rsvVar = new rsv(this, aolnVar);
        }
        java.lang.Object obj = rsvVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i3 = rsvVar.c;
        if (i3 == 0) {
            defpackage.aooc.af(obj);
            defpackage.ecx ecxVar = this.b;
            rsw rswVar = new rsw(rsdVar, i, (defpackage.aoln) null);
            rsvVar.c = 1;
            if (ecxVar.a(rswVar, rsvVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(defpackage.rsd rsdVar, defpackage.alcf alcfVar, defpackage.aoln aolnVar) {
        rsx rsxVar;
        if (aolnVar instanceof rsx) {
            rsxVar = (rsx) aolnVar;
            int i = rsxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rsxVar.c = i - Integer.MIN_VALUE;
            } else {
                rsxVar = new rsx(this, aolnVar);
            }
        } else {
            rsxVar = new rsx(this, aolnVar);
        }
        java.lang.Object obj = rsxVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = rsxVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.ecx ecxVar = this.b;
            lnb lnbVar = new lnb(rsdVar, alcfVar, (defpackage.aoln) null, 11);
            rsxVar.c = 1;
            if (ecxVar.a(lnbVar, rsxVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
        }
        return defpackage.aojh.a;
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class lbu implements defpackage.kfh {
    private static final defpackage.aimz e = defpackage.aimz.i("com/android/dialer/callscreen/calllogdatasource/CallScreenDataSource");
    public final defpackage.ajct a;
    public final defpackage.lkk b;
    public final java.util.concurrent.atomic.AtomicLong c = new java.util.concurrent.atomic.AtomicLong(-1);
    public final defpackage.rsr d;
    private final defpackage.ajct f;
    private final defpackage.zjm g;
    private final defpackage.aogc h;

    public lbu(defpackage.ajct ajctVar, defpackage.ajct ajctVar2, defpackage.aogc aogcVar, defpackage.rsr rsrVar, defpackage.lkk lkkVar, defpackage.zjm zjmVar) {
        this.f = ajctVar;
        this.a = ajctVar2;
        this.h = aogcVar;
        this.d = rsrVar;
        this.b = lkkVar;
        this.g = zjmVar;
    }

    private static boolean f(lkq lkqVar) {
        lgp lgpVar;
        return (lkqVar == null || (lgpVar = lkqVar.b) == null || lgpVar.b.size() <= 1) ? false : true;
    }

    @Override // defpackage.kfh
    public final defpackage.aenj a() {
        return new defpackage.aenj("CallScreenDataSource");
    }

    @Override // defpackage.kfh
    public final defpackage.ajcq b(defpackage.kfj kfjVar) {
        defpackage.ajcq ajcqVar;
        ((defpackage.aimw) ((defpackage.aimw) e.b()).l("com/android/dialer/callscreen/calllogdatasource/CallScreenDataSource", "fill", 104, "CallScreenDataSource.java")).v("fill");
        defpackage.kfk kfkVar = (defpackage.kfk) kfjVar;
        java.util.Map map = kfkVar.a;
        defpackage.ajcq[] ajcqVarArr = new defpackage.ajcq[3];
        boolean zIsEmpty = map.isEmpty();
        java.util.Map map2 = kfkVar.b;
        int i = 6;
        if (zIsEmpty && map2.isEmpty()) {
            ajcqVar = defpackage.ajcm.a;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(map.entrySet());
            arrayList.addAll(map2.entrySet());
            defpackage.ajcq ajcqVarB = this.b.b((java.util.List) j$.util.Collection.-EL.stream(arrayList).map(new kle(12)).filter(new jvr(15)).collect(j$.util.stream.Collectors.toCollection(new iaz(6))));
            lbs lbsVar = new lbs(0);
            defpackage.ajct ajctVar = this.a;
            defpackage.ajcq ajcqVarH = defpackage.ahvr.H(ajcqVarB, lbsVar, ajctVar);
            juo juoVar = new juo(this, kfjVar, arrayList, 8);
            long j = defpackage.ahqx.a;
            defpackage.ajax ajaxVar = new defpackage.ajax(defpackage.ahns.c(false), (defpackage.ajat) juoVar, 1);
            int i2 = defpackage.ajan.c;
            defpackage.ajal ajalVar = new defpackage.ajal(ajcqVarH, ajaxVar);
            ajcqVarH.c(ajalVar, defpackage.aiql.t(ajctVar, ajalVar));
            ajcqVar = ajalVar;
        }
        ajcqVarArr[0] = ajcqVar;
        defpackage.ahrv ahrvVarG = defpackage.ahrv.g(this.h.bk());
        defpackage.jwf jwfVar = new defpackage.jwf(this, 10);
        defpackage.ajct ajctVar2 = this.a;
        ajcqVarArr[1] = defpackage.ahrv.g(ahrvVarG.i(jwfVar, ajctVar2).i(new defpackage.kjs(this, kfjVar, 6), this.f)).h(new defpackage.jtv(this, kfjVar, i, null), ajctVar2).i(new defpackage.uqd(1), ajctVar2);
        ajcqVarArr[2] = defpackage.ajcm.a;
        return new defpackage.ahda(new defpackage.anpu(true, defpackage.aify.o(ajcqVarArr)), (byte[]) null).o(new defpackage.kve(2), defpackage.ajbm.INSTANCE);
    }

    public final defpackage.ajcq c(lkq lkqVar) {
        j$.util.Optional optionalEmpty;
        j$.util.Optional optionalEmpty2;
        defpackage.akzx akzxVarM = kir.a.m();
        if (f(lkqVar)) {
            java.lang.String str = (java.lang.String) j$.util.Collection.-EL.stream(lkqVar.b.b).filter(new jvr(14)).map(new kle(11)).collect(j$.util.stream.Collectors.joining(" "));
            optionalEmpty = android.text.TextUtils.isEmpty(str) ? j$.util.Optional.empty() : j$.util.Optional.of(str);
        } else {
            optionalEmpty = j$.util.Optional.empty();
        }
        if (optionalEmpty.isPresent()) {
            java.lang.String str2 = (java.lang.String) optionalEmpty.orElseThrow();
            akzxVarM.u();
            kir kirVar = akzxVarM.b;
            j$.util.Objects.requireNonNull(str2);
            kirVar.b |= 1;
            kirVar.c = str2;
            defpackage.ahvr.bM(f(lkqVar));
            boolean zAnyMatch = j$.util.Collection.-EL.stream(lkqVar.b.b).anyMatch(new jvr(16));
            akzxVarM.u();
            kir kirVar2 = akzxVarM.b;
            kirVar2.b |= 8;
            kirVar2.f = zAnyMatch;
        } else {
            if (f(lkqVar)) {
                defpackage.alat alatVar = lkqVar.b.b;
                lgo lgoVar = (lgo) alatVar.get(1);
                int iAN = defpackage.a.aN(lgoVar.g);
                if (iAN == 0 || iAN != 4 || lgoVar.e.isEmpty()) {
                    lgo lgoVar2 = (lgo) alatVar.get(2);
                    int iAN2 = defpackage.a.aN(lgoVar2.g);
                    optionalEmpty2 = (iAN2 == 0 || iAN2 != 4 || lgoVar2.e.isEmpty()) ? j$.util.Optional.empty() : j$.util.Optional.of(lgoVar2.e);
                } else {
                    optionalEmpty2 = j$.util.Optional.of(lgoVar.e);
                }
            } else {
                optionalEmpty2 = j$.util.Optional.empty();
            }
            kwv kwvVar = new kwv(akzxVarM, 5);
            if (true == optionalEmpty2.isPresent()) {
                java.lang.Object obj = optionalEmpty2.get();
                defpackage.akzx akzxVar = (defpackage.akzx) kwvVar.a;
                akzxVar.u();
                kir kirVar3 = akzxVar.b;
                j$.util.Objects.requireNonNull(obj);
                kirVar3.b |= 4;
                kirVar3.e = (java.lang.String) obj;
            }
        }
        ljx ljxVar = lkqVar.g;
        if (ljxVar != null) {
            ljy ljyVar = ljxVar.c;
            if (ljyVar == null) {
                ljyVar = ljy.a;
            }
            boolean z = ljyVar.c;
            akzxVarM.u();
            kir kirVar4 = akzxVarM.b;
            kirVar4.b |= 16;
            kirVar4.g = z;
            ljy ljyVar2 = lkqVar.g.c;
            if (ljyVar2 == null) {
                ljyVar2 = ljy.a;
            }
            java.lang.String str3 = ljyVar2.f;
            akzxVarM.u();
            kir kirVar5 = akzxVarM.b;
            j$.util.Objects.requireNonNull(str3);
            kirVar5.b |= 32;
            kirVar5.h = str3;
        }
        java.lang.String str4 = lkqVar.c;
        if (android.text.TextUtils.isEmpty(str4)) {
            return defpackage.aiql.z(akzxVarM.r());
        }
        j$.util.Optional optionalG = this.g.g();
        return defpackage.ahvr.H(!optionalG.isPresent() ? defpackage.aiql.z(java.lang.Boolean.FALSE) : ((defpackage.swv) optionalG.orElseThrow()).b(), new iau(akzxVarM, str4, 14), this.a);
    }

    @Override // defpackage.kfh
    public final defpackage.ajcq d() {
        return defpackage.ahvr.H(this.h.bk(), new lbs(2), this.a);
    }

    @Override // defpackage.kfh
    public final defpackage.ajcq e() {
        long j = this.c.get();
        if (j <= 0) {
            return defpackage.ajcm.a;
        }
        ((defpackage.aimw) ((defpackage.aimw) e.b()).l("com/android/dialer/callscreen/calllogdatasource/CallScreenDataSource", "onSuccessfulFill", 443, "CallScreenDataSource.java")).x("timestamp %d", j);
        return defpackage.ahvr.H(this.h.bl(new jwe(j, 3)), new lbs(1), this.a);
    }
}

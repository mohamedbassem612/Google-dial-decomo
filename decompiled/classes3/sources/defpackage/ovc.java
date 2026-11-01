package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ovc extends aomh implements aonn {
    int a;
    final /* synthetic */ amzg b;
    final /* synthetic */ amzg c;
    final /* synthetic */ amzg d;
    final /* synthetic */ amzg e;
    private /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovc(amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, aoln aolnVar) {
        super(2, aolnVar);
        this.b = amzgVar;
        this.c = amzgVar2;
        this.d = amzgVar3;
        this.e = amzgVar4;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:36:0x0103 A[LOOP:0: B:34:0x00fd->B:36:0x0103, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x0126  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) {
        aoss aossVar;
        aosy aosyVarAm;
        aihd aihdVar;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        aolu aoluVar = aolu.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                aossVar = (aoss) this.f;
                aooc.af(obj);
            } else {
                if (i == 2) {
                    aosyVarAm = (aosy) this.f;
                    aooc.af(obj);
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                        this.f = null;
                        this.a = 3;
                        obj = aosyVarAm.a(this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                            ajcq ajcqVarD = this.b.d();
                            this.a = 4;
                            obj = aosv.D(ajcqVarD, this);
                            if (obj == aoluVar) {
                                return aoluVar;
                            }
                        }
                    }
                    return j$.util.Optional.empty();
                }
                aooc.af(obj);
                if (i == 3) {
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                        ajcq ajcqVarD2 = this.b.d();
                        this.a = 4;
                        obj = aosv.D(ajcqVarD2, this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                    }
                    return j$.util.Optional.empty();
                }
            }
            aihdVar = (aihd) obj;
            if (!aihdVar.isEmpty()) {
                return j$.util.Optional.of(defpackage.oue.AURORA_AVATAR);
            }
            aimw aimwVarL = defpackage.ovd.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/incall/answer/avatar/service/AvatarProducerModule", "produceAvatarCenterFragmentCandidateKey$<anonymous>$<anonymous>", 68, "AvatarProducerModule.kt");
            aooh.c(aihdVar);
            arrayList = new java.util.ArrayList(ajsz.bl(aihdVar, 10));
            it = aihdVar.iterator();
            while (it.hasNext()) {
                arrayList.add(((defpackage.pdi) it.next()).a());
            }
            aimwVarL.y("Avatar inhibited by %s", ajsz.cr(arrayList, ", ", (java.lang.CharSequence) null, (java.lang.CharSequence) null, (aonj) null, 62));
            return j$.util.Optional.empty();
        }
        aooc.af(obj);
        aossVar = (aoss) this.f;
        ajcq ajcqVarD3 = this.c.d();
        aosy aosyVarAm2 = aoov.am(aossVar, 0, new ogf(ajcqVarD3, (aoln) null, 19), 3);
        aosyVarAm2.p(new lwl(ajcqVarD3, 4));
        this.f = aossVar;
        this.a = 1;
        obj = aosyVarAm2.a(this);
        if (obj == aoluVar) {
            return aoluVar;
        }
        defpackage.abwd abwdVar = (defpackage.abwd) obj;
        boolean z = (abwdVar.b & 4) != 0 || abwdVar.k;
        ajcq ajcqVarD4 = this.d.d();
        aosy aosyVarAm3 = aoov.am(aossVar, 0, new ogf(ajcqVarD4, (aoln) null, 20, (byte[]) null), 3);
        aosyVarAm3.p(new lwl(ajcqVarD4, 5));
        ajcq ajcqVarD5 = this.e.d();
        aosyVarAm = aoov.am(aossVar, 0, new defpackage.ovz(ajcqVarD5, (aoln) null, 1), 3);
        aosyVarAm.p(new lwl(ajcqVarD5, 6));
        if (z) {
            this.f = aosyVarAm;
            this.a = 2;
            obj = aosyVarAm3.a(this);
            if (obj == aoluVar) {
                return aoluVar;
            }
            if (!((java.lang.Boolean) obj).booleanValue()) {
                this.f = null;
                this.a = 3;
                obj = aosyVarAm.a(this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    ajcq ajcqVarD6 = this.b.d();
                    this.a = 4;
                    obj = aosv.D(ajcqVarD6, this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    aihdVar = (aihd) obj;
                    if (!aihdVar.isEmpty()) {
                        return j$.util.Optional.of(defpackage.oue.AURORA_AVATAR);
                    }
                    aimw aimwVarL2 = defpackage.ovd.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/incall/answer/avatar/service/AvatarProducerModule", "produceAvatarCenterFragmentCandidateKey$<anonymous>$<anonymous>", 68, "AvatarProducerModule.kt");
                    aooh.c(aihdVar);
                    arrayList = new java.util.ArrayList(ajsz.bl(aihdVar, 10));
                    it = aihdVar.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((defpackage.pdi) it.next()).a());
                    }
                    aimwVarL2.y("Avatar inhibited by %s", ajsz.cr(arrayList, ", ", (java.lang.CharSequence) null, (java.lang.CharSequence) null, (aonj) null, 62));
                    return j$.util.Optional.empty();
                }
            }
        }
        return j$.util.Optional.empty();
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.ovc ovcVar = new defpackage.ovc(this.b, this.c, this.d, this.e, aolnVar);
        ovcVar.f = obj;
        return ovcVar;
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class jsf implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ jsf(acyu acyuVar, boolean z, acwb acwbVar, ajat ajatVar, int i) {
        this.$cid = i;
        this.c = acyuVar;
        this.a = z;
        this.b = acwbVar;
        this.d = ajatVar;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0092  */
    /* JADX WARN: Type inference failed for: r0v17, types: [ajat, java.lang.Object] */
    public final ajcq a(java.lang.Object obj) {
        int iY;
        int i = this.$cid;
        boolean z = true;
        if (i == 0) {
            akzx akzxVarP = ((spa) ((j$.util.Optional) obj).orElse(spa.a)).p();
            akzx akzxVarM = soy.a.m();
            akzxVarM.u();
            soy soyVar = akzxVarM.b;
            soyVar.b |= 1;
            soyVar.c = this.a;
            jsm jsmVar = (jsm) this.c;
            long j = jsmVar.c;
            akzxVarM.u();
            soy soyVar2 = akzxVarM.b;
            soyVar2.b |= 2;
            soyVar2.d = j;
            akzxVarP.u();
            spa spaVar = akzxVarP.b;
            soy soyVarP = akzxVarM.p();
            j$.util.Objects.requireNonNull(soyVarP);
            spaVar.e = soyVarP;
            spaVar.b |= 1;
            return ((jsk) this.b).e((java.lang.String) this.d, akzxVarP.p(), jsmVar);
        }
        int i2 = 3;
        if (i == 1) {
            boolean z2 = this.a;
            java.lang.Object obj2 = this.c;
            java.lang.Object obj3 = this.b;
            if (!z2) {
                defpackage.ibk ibkVar = (defpackage.ibk) obj3;
                if (ibkVar.f.g()) {
                    defpackage.ibk.a.b().l("com/android/dialer/audio/impl/callaudioplayer/CallAudioPlayer", "playInternal", 220, "CallAudioPlayer.java").v("call is muted");
                    ibkVar.j = j$.util.Optional.of(ibkVar.m.d(aiql.z(defpackage.hxe.d), (java.lang.String) obj2, false));
                    ((defpackage.ibl) ibkVar.j.orElseThrow()).c = 0;
                    return aiql.z((defpackage.hxf) ibkVar.j.orElseThrow());
                }
            }
            defpackage.ibk ibkVar2 = (defpackage.ibk) obj3;
            ahrv ahrvVarH = ahrv.g(ibkVar2.b.b()).h(new defpackage.iau(obj3, this.d, i2), ibkVar2.c);
            defpackage.hup hupVar = new defpackage.hup(obj3, 7);
            ajcu ajcuVar = ibkVar2.d;
            return ahrv.g(ahrvVarH.e(java.lang.IllegalStateException.class, hupVar, ajcuVar).j(((java.lang.Long) ibkVar2.e.a()).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS, ajcuVar).e(java.util.concurrent.TimeoutException.class, new defpackage.exn(12), ajcuVar)).h(new vrm(ibkVar2, (java.lang.String) obj2, z2, 1), ajcuVar);
        }
        if (i == 2) {
            android.net.Uri uri = (android.net.Uri) obj;
            if (!this.a) {
                return ajcm.a;
            }
            return ((vmc) this.c).b(((vmf) this.d).f, uri, (android.telecom.PhoneAccountHandle) this.b);
        }
        acvu acvuVar = (acvu) obj;
        if (acvuVar == null || !((iY = afsq.Y(acvuVar.r)) == 0 || iY == 1)) {
            return aiql.z((java.lang.Object) null);
        }
        acvw acvwVar = acvuVar.m;
        if (acvwVar == null) {
            acvwVar = acvw.a;
        }
        int iAQ = a.aQ(acvwVar.d);
        if (iAQ == 0 || iAQ != 2) {
            acvw acvwVar2 = acvuVar.m;
            if (acvwVar2 == null) {
                acvwVar2 = acvw.a;
            }
            int iAQ2 = a.aQ(acvwVar2.d);
            if (iAQ2 == 0 || iAQ2 != 3) {
                z = false;
            } else {
                long jV = abrz.V();
                acvs acvsVar = acvuVar.c;
                if (acvsVar == null) {
                    acvsVar = acvs.a;
                }
                long j2 = jV - acvsVar.d;
                acvw acvwVar3 = acvuVar.m;
                if (acvwVar3 == null) {
                    acvwVar3 = acvw.a;
                }
                if (j2 / 1000 > acvwVar3.e) {
                    akzx akzxVarP2 = acvuVar.p();
                    acvw acvwVar4 = acvuVar.m;
                    if (acvwVar4 == null) {
                        acvwVar4 = acvw.a;
                    }
                    akzx akzxVarP3 = acvwVar4.p();
                    akzxVarP3.u();
                    acvw acvwVar5 = akzxVarP3.b;
                    acvwVar5.d = 1;
                    acvwVar5.b |= 2;
                    akzxVarP2.u();
                    acvu acvuVar2 = akzxVarP2.b;
                    acvw acvwVarP = akzxVarP3.p();
                    j$.util.Objects.requireNonNull(acvwVarP);
                    acvuVar2.m = acvwVarP;
                    acvuVar2.b |= 2048;
                    acvuVar = (acvu) akzxVarP2.p();
                } else {
                    z = false;
                }
            }
        }
        boolean z3 = this.a;
        java.lang.String str = acvuVar.d;
        int i3 = adbe.a;
        if (!z3 && !z) {
            return aiql.z((java.lang.Object) null);
        }
        acvw acvwVar6 = acvuVar.m;
        if (acvwVar6 == null) {
            acvwVar6 = acvw.a;
        }
        return ((acyu) this.c).e((acwb) this.b, acvwVar6, (ajat) this.d);
    }

    public /* synthetic */ jsf(java.lang.Object obj, boolean z, java.lang.Object obj2, java.lang.String str, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = z;
        this.c = obj2;
        this.d = str;
    }

    public /* synthetic */ jsf(vmc vmcVar, boolean z, vmf vmfVar, android.telecom.PhoneAccountHandle phoneAccountHandle, int i) {
        this.$cid = i;
        this.c = vmcVar;
        this.a = z;
        this.d = vmfVar;
        this.b = phoneAccountHandle;
    }
}

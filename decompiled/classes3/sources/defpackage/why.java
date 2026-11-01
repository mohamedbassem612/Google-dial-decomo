package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class why implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ why(java.lang.Object obj, java.lang.String str, alad aladVar, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = str;
        this.c = aladVar;
    }

    public final ajcq a(java.lang.Object obj) {
        int i = this.$cid;
        byte[] bArr = null;
        if (i == 0) {
            ammt ammtVarDG = ajsz.dG((java.lang.String) this.b, new ammp(), (amms) obj, new defpackage.ammw(new defpackage.vaa((short[]) null)));
            defpackage.whz.b.b().i(zct.a).l("com/android/dialer/xatu/impl/donation/ScottyUploadChannel", "upload", 118, "ScottyUploadChannel.java").y("Xatu about to start Scotty send with upload_id %s", ((defpackage.wrk) this.c).c);
            return ammtVarDG.a();
        }
        if (i == 1) {
            java.lang.Object obj2 = this.b;
            java.lang.Object obj3 = this.a;
            vvl vvlVar = (vvl) this.c;
            android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) obj3;
            return ahvr.ak(new ajcq[]{vvlVar.i(phoneAccountHandle, (java.lang.String) obj2), vvlVar.h(phoneAccountHandle)}).q(new fvl(12), vvlVar.c);
        }
        if (i == 2) {
            java.lang.Object obj4 = this.b;
            j$.util.Optional optional = (j$.util.Optional) obj;
            j$.util.Objects.requireNonNull(obj4);
            defpackage.wlm wlmVar = new defpackage.wlm(obj4, 6);
            if (true == optional.isPresent()) {
                java.lang.String str = (java.lang.String) optional.get();
                akzx akzxVar = (akzx) wlmVar.a;
                akzxVar.u();
                defpackage.wrf wrfVar = (defpackage.wrf) akzxVar.b;
                defpackage.wrf wrfVar2 = defpackage.wrf.a;
                j$.util.Objects.requireNonNull(str);
                wrfVar.b |= 4;
                wrfVar.e = str;
            }
            java.lang.Object obj5 = this.a;
            java.lang.Object obj6 = this.c;
            return ahvr.F(new defpackage.whv(obj6, obj5, 9, bArr), ((defpackage.wrh) obj6).e);
        }
        if (i == 3) {
            java.lang.Object obj7 = this.b;
            j$.util.Optional optional2 = (j$.util.Optional) obj;
            j$.util.Objects.requireNonNull(obj7);
            defpackage.wlm wlmVar2 = new defpackage.wlm(obj7, 7);
            int i2 = 8;
            if (true == optional2.isPresent()) {
                java.lang.String str2 = (java.lang.String) optional2.get();
                akzx akzxVar2 = (akzx) wlmVar2.a;
                akzxVar2.u();
                defpackage.wrf wrfVar3 = (defpackage.wrf) akzxVar2.b;
                defpackage.wrf wrfVar4 = defpackage.wrf.a;
                j$.util.Objects.requireNonNull(str2);
                wrfVar3.b |= 8;
                wrfVar3.f = str2;
            }
            java.lang.Object obj8 = this.a;
            java.lang.Object obj9 = this.c;
            return ahvr.F(new defpackage.whv(obj9, obj8, i2, bArr), ((defpackage.wrh) obj9).e);
        }
        if (i != 4) {
            ammt ammtVarDG2 = ajsz.dG((java.lang.String) this.b, new ammp(), (amms) obj, new defpackage.ammw(new defpackage.vaa((short[]) null)));
            defpackage.wzk.b.b().i(zct.a).l("com/android/incallui/atlas/ui/impl/donation/ScottyUploadChannel", "upload", 119, "ScottyUploadChannel.java").y("Atlas about to start Scotty send with upload_id %s", ((defpackage.xac) this.c).i);
            return ammtVarDG2.a();
        }
        java.lang.Object obj10 = this.b;
        j$.util.Optional optional3 = (j$.util.Optional) obj;
        j$.util.Objects.requireNonNull(obj10);
        defpackage.wlm wlmVar3 = new defpackage.wlm(obj10, 5);
        if (true == optional3.isPresent()) {
            java.lang.String str3 = (java.lang.String) optional3.get();
            akzx akzxVar3 = (akzx) wlmVar3.a;
            akzxVar3.u();
            defpackage.wrf wrfVar5 = (defpackage.wrf) akzxVar3.b;
            defpackage.wrf wrfVar6 = defpackage.wrf.a;
            j$.util.Objects.requireNonNull(str3);
            wrfVar5.b |= 16;
            wrfVar5.g = str3;
        }
        akzx akzxVarM = defpackage.wqs.a.m();
        defpackage.wrf wrfVar7 = (defpackage.wrf) ((akzx) obj10).p();
        akzxVarM.u();
        defpackage.wqs wqsVar = (defpackage.wqs) akzxVarM.b;
        j$.util.Objects.requireNonNull(wrfVar7);
        alat alatVar = wqsVar.c;
        if (!alatVar.c()) {
            wqsVar.c = alad.J(alatVar);
        }
        java.lang.Object obj11 = this.a;
        java.lang.Object obj12 = this.c;
        wqsVar.c.add(wrfVar7);
        return ((defpackage.wrh) obj12).c.e(((defpackage.wrc) obj11).c, (defpackage.wqs) akzxVarM.p());
    }

    public /* synthetic */ why(vvl vvlVar, android.telecom.PhoneAccountHandle phoneAccountHandle, java.lang.String str, int i) {
        this.$cid = i;
        this.c = vvlVar;
        this.a = phoneAccountHandle;
        this.b = str;
    }

    public /* synthetic */ why(defpackage.wrh wrhVar, akzx akzxVar, defpackage.wrc wrcVar, int i) {
        this.$cid = i;
        this.c = wrhVar;
        this.b = akzxVar;
        this.a = wrcVar;
    }
}

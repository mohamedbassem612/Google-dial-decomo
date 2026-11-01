package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vll implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ vll(java.lang.Object obj, java.lang.Object obj2, boolean z, int i) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v35, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r7v1, types: [ajat, java.lang.Object] */
    public final ajcq a(java.lang.Object obj) {
        ajcq ajcqVarH;
        int i = 20;
        switch (this.$cid) {
            case 0:
                java.lang.String str = (java.lang.String) obj;
                vmi.a.b().l("com/android/dialer/voicemail/service/impl/vvmclients/rest/VvmActivation", "activate", 73, "VvmActivation.java").v("activate");
                java.lang.String strN = tvn.n(true);
                defpackage.ajzk ajzkVar = new defpackage.ajzk();
                ajzkVar.d("PUT");
                vmi vmiVar = ((vlm) this.b).e;
                vls vlsVar = vmiVar.e;
                ajzkVar.f(vlsVar.j.q(str));
                ajzkVar.e("application/json", java.nio.ByteBuffer.wrap(strN.getBytes()));
                ajzkVar.b(defpackage.ajzj.a("content-length"), java.lang.String.valueOf(strN.getBytes().length));
                ahrv ahrvVarG = ahrv.g(ahrv.g(vlsVar.e(new defpackage.ajzm(ajzkVar), 2)).h(new defpackage.vlk(5), vlsVar.d));
                java.lang.Object obj2 = this.c;
                defpackage.vjx vjxVar = new defpackage.vjx(vmiVar, str, obj2, 17, (byte[]) null);
                ajct ajctVar = vmiVar.d;
                return ahrvVarG.i(vjxVar, ajctVar).i(new defpackage.vkn(vmiVar, obj2, 15), ajctVar).h(new defpackage.vmb(vmiVar, 6), ajctVar).e(defpackage.vcx.class, new kxa(this.a, 6), ajctVar).f(java.lang.Exception.class, new defpackage.vkn(vmiVar, obj2, 16), ajctVar);
            case 1:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                ?? r0 = this.b;
                ahoq ahoqVarW = ahvr.W(846, "MotoSuggestionProvider_getSuggestion_onIsAvailableResult");
                try {
                    if (bool.booleanValue() && !android.text.TextUtils.isEmpty(r0)) {
                        boolean z = this.a;
                        java.lang.Object obj3 = this.c;
                        if (z) {
                            ajcqVarH = ahvr.F(new raj(obj3, 20), ((defpackage.svm) obj3).d);
                        } else {
                            ahoq ahoqVarW2 = ahvr.W(845, "MotoSuggestionProvider.getSuggestionForVoice");
                            try {
                                ajcq ajcqVarF = ahvr.F(new defpackage.qfb(obj3, r0, i), ((defpackage.svm) obj3).d);
                                java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
                                ajcu ajcuVar = ((defpackage.svm) obj3).e;
                                ajcqVarH = ahvr.H(ahvr.B(aiql.G(ajcqVarF, 1L, timeUnit, ajcuVar), java.lang.Exception.class, new defpackage.rht(14), ajcuVar), new oqe(obj3, (java.lang.Object) r0, 18), ajcuVar);
                                ahoqVarW2.close();
                            } catch (java.lang.Throwable th) {
                                try {
                                    ahoqVarW2.close();
                                    throw th;
                                } catch (java.lang.Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        }
                    } else {
                        ajcqVarH = aiql.z(j$.util.Optional.empty());
                    }
                    ahoqVarW.close();
                    return ajcqVarH;
                } catch (java.lang.Throwable th3) {
                    try {
                        ahoqVarW.close();
                        throw th3;
                    } catch (java.lang.Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            case 2:
                return ((defpackage.vrp) this.b).l.l((android.telecom.PhoneAccountHandle) this.c, this.a);
            case 3:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object obj4 = this.c;
                if (!zBooleanValue) {
                    ((acyu) obj4).b.l(1036);
                    return aiql.y(new java.io.IOException("Unable to update file group metadata"));
                }
                ?? r10 = this.b;
                if (this.a) {
                    new defpackage.vaa(((acyu) obj4).b).F(1072, (defpackage.acvu) aiql.H((java.util.concurrent.Future) r10));
                }
                return aiql.z((defpackage.acvu) aiql.H((java.util.concurrent.Future) r10));
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = ((java.util.List) obj).iterator();
                while (true) {
                    java.lang.Object obj5 = this.c;
                    if (!it.hasNext()) {
                        return abrz.ac(arrayList).D(new defpackage.vnc(20), ((acyu) obj5).f);
                    }
                    defpackage.acwb acwbVar = (defpackage.acwb) it.next();
                    if (!acwbVar.f) {
                        ?? r7 = this.b;
                        acyu acyuVar = (acyu) obj5;
                        arrayList.add(acyuVar.q(acyuVar.d.g(acwbVar), new jsf(acyuVar, this.a, acwbVar, (ajat) r7, 3)));
                    }
                }
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                aczk aczkVar = (aczk) this.c;
                if (!aczkVar.k.P()) {
                    return ajcm.a;
                }
                java.lang.Object obj6 = this.b;
                boolean z2 = this.a;
                aczkVar.c.l(1031);
                acyu acyuVar2 = aczkVar.d;
                return acyuVar2.q(acyuVar2.d.d(), ahqx.c(new defpackage.vll(acyuVar2, z2, obj6, 4)));
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return ((aczk) this.b).d.g((defpackage.acwb) this.c, this.a);
            default:
                java.util.List<defpackage.agon> list = (java.util.List) obj;
                aooh.c(list);
                java.util.ArrayList arrayList2 = new java.util.ArrayList(ajsz.bl(list, 10));
                for (defpackage.agon agonVar : list) {
                    boolean z3 = this.a;
                    java.lang.Object obj7 = this.b;
                    java.lang.Object obj8 = this.c;
                    arrayList2.add(((aogc) obj8).q((java.lang.String) obj7, agonVar.a, agonVar.b, z3));
                }
                return agab.aL(arrayList2);
        }
    }

    public /* synthetic */ vll(java.lang.Object obj, java.lang.String str, boolean z, int i) {
        this.$cid = i;
        this.c = obj;
        this.b = str;
        this.a = z;
    }

    public /* synthetic */ vll(java.lang.Object obj, boolean z, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.c = obj;
        this.a = z;
        this.b = obj2;
    }
}

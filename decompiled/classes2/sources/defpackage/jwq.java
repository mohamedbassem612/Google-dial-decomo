package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jwq extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amzg h;
    private final amyz i;
    private final amyz j;
    private final amyz k;
    private final amzg l;
    private final amzg m;

    public jwq(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amyz amyzVar3, amyz amyzVar4, amyz amyzVar5, amzg amzgVar8, amzg amzgVar9) {
        super(amyzVar2, new amzw(defpackage.jwq.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
        this.h = amzs.b(amzgVar7);
        this.i = amyzVar3;
        this.j = amyzVar4;
        this.k = amyzVar5;
        this.l = amzs.b(amzgVar8);
        this.m = amzs.b(amzgVar9);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x01b0  */
    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        boolean z;
        aikn aiknVar;
        aikn aileVar;
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        j$.util.Optional optional = (j$.util.Optional) list.get(1);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(2)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(3)).booleanValue();
        boolean zBooleanValue3 = ((java.lang.Boolean) list.get(4)).booleanValue();
        zpo zpoVar = (zpo) list.get(5);
        long jLongValue = ((java.lang.Long) list.get(6)).longValue();
        defpackage.jwa jwaVar = (defpackage.jwa) list.get(7);
        j$.util.Optional optional2 = (j$.util.Optional) list.get(8);
        if (optional.isPresent()) {
            android.os.PersistableBundle persistableBundle = (android.os.PersistableBundle) optional.orElseThrow();
            if (persistableBundle.getBoolean("display_call_type_icon_bool", false)) {
                amyz amyzVar = this.k;
                jwaVar.d |= zBooleanValue;
                jwaVar.c |= zBooleanValue2;
                jwaVar.e |= zBooleanValue3;
                if (zBooleanValue) {
                    if (((java.lang.Boolean) this.i.a()).booleanValue()) {
                        if (zBooleanValue2) {
                            ((kgl) amyzVar.a()).d(jLongValue, 6);
                            pmm pmmVar = new pmm();
                            pmmVar.e(pms.d);
                            pmmVar.c(defpackage.hmr.f(context, 2131231109));
                            pmmVar.d(2131231109);
                            pmmVar.b(context.getString(2132018128));
                            aileVar = new aile(pmmVar.a());
                        } else {
                            ((kgl) amyzVar.a()).d(jLongValue, 7);
                            int iC = jwk.c(persistableBundle) - 1;
                            if (iC == 0) {
                                aiknVar = aikn.a;
                            } else if (iC != 1) {
                                pmm pmmVar2 = new pmm();
                                pmmVar2.e(pms.d);
                                pmmVar2.c(defpackage.hmr.f(context, 2131231114));
                                pmmVar2.d(2131231114);
                                pmmVar2.b(context.getString(2132018131));
                                aileVar = new aile(pmmVar2.a());
                            } else {
                                pmm pmmVar3 = new pmm();
                                pmmVar3.e(pms.d);
                                pmmVar3.c(defpackage.hmr.f(context, 2131231112));
                                pmmVar3.d(2131231112);
                                pmmVar3.b(context.getString(2132018131));
                                aileVar = new aile(pmmVar3.a());
                            }
                        }
                        aiknVar = aileVar;
                    } else {
                        aiknVar = aikn.a;
                    }
                } else if (((java.lang.Boolean) this.j.a()).booleanValue()) {
                    if (optional2.isPresent()) {
                        android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) optional2.orElseThrow();
                        if (zpoVar == zpo.f && ((jwj) agab.aH(context, jwj.class)).be().i(phoneAccountHandle).f() == 13) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    jwaVar.b |= z;
                    if (z) {
                        if (zBooleanValue2) {
                            ((kgl) amyzVar.a()).d(jLongValue, 5);
                            pmm pmmVar4 = new pmm();
                            pmmVar4.e(pms.d);
                            pmmVar4.c(defpackage.hmr.f(context, 2131231108));
                            pmmVar4.d(2131231108);
                            pmmVar4.b(context.getString(2132018127));
                            aileVar = new aile(pmmVar4.a());
                        } else {
                            ((kgl) amyzVar.a()).d(jLongValue, 4);
                            int iB = jwk.b(persistableBundle) - 1;
                            if (iB == 0) {
                                aiknVar = aikn.a;
                            } else if (iB != 1) {
                                pmm pmmVar5 = new pmm();
                                pmmVar5.e(pms.d);
                                pmmVar5.c(defpackage.hmr.f(context, 2131231113));
                                pmmVar5.d(2131231113);
                                pmmVar5.b(context.getString(2132018129));
                                aileVar = new aile(pmmVar5.a());
                            } else {
                                pmm pmmVar6 = new pmm();
                                pmmVar6.e(pms.d);
                                pmmVar6.c(defpackage.hmr.f(context, 2131231111));
                                pmmVar6.d(2131231111);
                                pmmVar6.b(context.getString(2132018130));
                                aileVar = new aile(pmmVar6.a());
                            }
                        }
                        aiknVar = aileVar;
                    } else {
                        aiknVar = aikn.a;
                    }
                } else {
                    aiknVar = aikn.a;
                }
            } else {
                hgb.c(defpackage.jwn.a.b(), "display_call_type_icon_bool not defined in the carrier config", "com/android/dialer/callingnetworks/impl/CallingNetworksInCallProducerModule", "produceConnectionTechnologyIcon", 'X', "CallingNetworksInCallProducerModule.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
                aiknVar = aikn.a;
            }
        } else {
            hgb.c(defpackage.jwn.a.b(), "no carrier config", "com/android/dialer/callingnetworks/impl/CallingNetworksInCallProducerModule", "produceConnectionTechnologyIcon", 'N', "CallingNetworksInCallProducerModule.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
            aiknVar = aikn.a;
        }
        return aiql.z(aiknVar);
    }

    protected final ajcq c() {
        amzg amzgVar = this.m;
        amzg amzgVar2 = this.l;
        amzg amzgVar3 = this.h;
        amzg amzgVar4 = this.g;
        amzg amzgVar5 = this.f;
        amzg amzgVar6 = this.e;
        amzg amzgVar7 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar7.d(), amzgVar6.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}

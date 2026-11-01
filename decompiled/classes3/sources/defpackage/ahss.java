package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahss implements ahqh {
    public final aoin a;
    private final aoin b;
    private final aoin c;
    private final aoin d;

    public ahss(aoin aoinVar, aoin aoinVar2, ahyn ahynVar, aoin aoinVar3, aoin aoinVar4) {
        this.b = aoinVar;
        this.c = aoinVar2;
        this.d = aoinVar3;
        this.a = aoinVar4;
    }

    public final void a(final ahqy ahqyVar, final android.util.SparseArray sparseArray) {
        aoin aoinVar = this.b;
        if (((ahyn) aoinVar.a()).f()) {
            aeuu aeuuVar = (aeuu) ((ahyn) aoinVar.a()).b();
            if (aeuuVar.b()) {
                ahor ahorVarJ = ahou.j(ahst.f, (ahou) sparseArray.get(0, ahot.a));
                if (ahorVarJ.b()) {
                    ahst ahstVar = (ahst) ahorVarJ.a();
                    java.util.UUID uuid = new java.util.UUID(ahqyVar.c, ahqyVar.d);
                    java.lang.Boolean bool = ahstVar.c;
                    if (bool == null) {
                        synchronized (ahstVar) {
                            bool = ahstVar.c;
                            if (bool == null) {
                                if (((aeuu) ((ahys) ahstVar.a.a()).a).b()) {
                                    apga apgaVar = (apga) ahstVar.b.a();
                                    int iAM = a.aM(apgaVar.e);
                                    if (iAM == 0 || iAM != 3) {
                                        aevn aevnVarC = aevn.c(apgaVar);
                                        if (aevnVarC.g()) {
                                            ahstVar.c = java.lang.Boolean.FALSE;
                                        } else {
                                            float fA = aevnVarC.a();
                                            if (fA <= 0.0f || !ahvr.aa(uuid.getLeastSignificantBits(), fA)) {
                                                ahstVar.c = java.lang.Boolean.FALSE;
                                            } else {
                                                ahstVar.d = java.lang.Float.valueOf(fA);
                                                ahstVar.e = aevnVarC;
                                                ahstVar.c = java.lang.Boolean.TRUE;
                                            }
                                        }
                                    } else {
                                        ahstVar.d = java.lang.Float.valueOf(1.0f);
                                        ahstVar.e = aevn.a;
                                        ahstVar.c = java.lang.Boolean.TRUE;
                                    }
                                } else {
                                    ahstVar.c = java.lang.Boolean.FALSE;
                                }
                                bool = ahstVar.c;
                            }
                        }
                    }
                    ahvr.ci(bool);
                    if (bool.booleanValue()) {
                        aeut aeutVar = aeuuVar.a;
                        long j = ahqyVar.d;
                        float f = aeutVar.a;
                        ahyn ahynVarH = ahvr.aa(j, f) ? ahyn.h(java.lang.Float.valueOf(f)) : ahwt.a;
                        if (ahynVarH.f()) {
                            java.lang.Boolean bool2 = ahstVar.c;
                            final float fFloatValue = ((java.lang.Float) ahynVarH.b()).floatValue() * ((java.lang.Float) ((bool2 == null || !bool2.booleanValue()) ? ahwt.a : ahyn.g(ahstVar.d)).d(java.lang.Float.valueOf(1.0f))).floatValue();
                            new android.util.SparseArray();
                            aoin aoinVar2 = this.a;
                            aify aifyVar = aike.a;
                            boolean zBooleanValue = ((java.lang.Boolean) aoinVar2.a()).booleanValue();
                            final aify aifyVar2 = aike.a;
                            defpackage.ahta ahtaVarD = afsq.D(ahqyVar, sparseArray, fFloatValue, aifyVar2, zBooleanValue);
                            ahzi ahziVarBI = ahvr.bI(new ahzi() { // from class: ahsr
                                public final java.lang.Object eZ() {
                                    defpackage.ahsy ahsyVarA = defpackage.ahsz.a();
                                    ahsyVarA.f(ahqyVar);
                                    ahsyVarA.e(sparseArray);
                                    ahsyVarA.g(fFloatValue);
                                    ahsyVarA.c(((java.lang.Boolean) this.a.a.a()).booleanValue());
                                    ahsyVarA.b(aifyVar2);
                                    return afsq.E(ahsyVarA.a());
                                }
                            });
                            if (((defpackage.ahsx) ahziVarBI.eZ()).b) {
                                return;
                            }
                            aeuv aeuvVar = (aeuv) this.c.a();
                            aphg aphgVar = ((defpackage.ahsx) ahziVarBI.eZ()).a;
                            aenj aenjVar = ahtaVarD.a;
                            apev apevVar = ahtaVarD.b;
                            java.lang.Boolean bool3 = ahstVar.c;
                            aeuvVar.a(aphgVar, aenjVar.a, apevVar, (aevn) ((bool3 == null || !bool3.booleanValue()) ? ahwt.a : ahyn.g(ahstVar.e)).e());
                        }
                    }
                }
            }
        }
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class ahfu extends defpackage.ahft implements defpackage.aheh, defpackage.ahef, defpackage.ahfx {
    private static final long c = android.os.SystemClock.elapsedRealtime();
    public defpackage.ahpz a;
    public defpackage.aoin b;
    private java.lang.Boolean d;

    @Override // defpackage.ahef
    public final long c() {
        return c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0034. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    protected final boolean d() {
        java.lang.String strAp;
        boolean z;
        if (defpackage.agab.m == null) {
            if (!ft$.ExternalSyntheticApiModelOutline0.m()) {
                java.lang.String str = defpackage.agab.l;
                if (str == null) {
                    java.lang.String strAp2 = defpackage.agab.ap();
                    if (strAp2 == null) {
                        str = null;
                    } else {
                        int iIndexOf = strAp2.indexOf(58);
                        if (iIndexOf == -1) {
                            defpackage.agab.l = "";
                        } else {
                            defpackage.agab.l = strAp2.substring(iIndexOf);
                        }
                        str = defpackage.agab.l;
                    }
                }
                if (str != null) {
                    switch (str.hashCode()) {
                        case -737791795:
                            if (!str.equals(":primes_lifeboat")) {
                                if (str.startsWith(":privileged_process")) {
                                }
                            }
                            break;
                        case -733923188:
                            if (!str.equals(":learning_bg")) {
                                if (str.startsWith(":privileged_process")) {
                                }
                            }
                            break;
                        case 1771111950:
                            if (!str.equals(":train")) {
                                if (str.startsWith(":privileged_process")) {
                                }
                            }
                            break;
                        case 1892872565:
                            if (!str.equals(":leakcanary")) {
                                if (str.startsWith(":privileged_process")) {
                                }
                            }
                            break;
                        default:
                            z = str.startsWith(":privileged_process");
                            break;
                    }
                }
            }
            defpackage.agab.m = java.lang.Boolean.valueOf(z);
        }
        if (!defpackage.agab.m.booleanValue()) {
            java.lang.Boolean boolValueOf = this.d;
            if (boolValueOf == null) {
                defpackage.aikn aiknVar = defpackage.aikn.a;
                aiknVar.getClass();
                boolValueOf = java.lang.Boolean.valueOf((aiknVar.isEmpty() || (strAp = defpackage.agab.ap()) == null) ? false : aiknVar.contains(strAp));
                this.d = boolValueOf;
            }
            if (!boolValueOf.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    @Override // android.app.Application
    public void onCreate() throws afeb {
        if (!d()) {
            super.onCreate();
            return;
        }
        if (defpackage.ahns.q()) {
            ((defpackage.aiyy) this.b.a()).a();
            super.onCreate();
            return;
        }
        long jAG = defpackage.agab.aG();
        long jAF = defpackage.agab.aF(jAG);
        defpackage.ahqz ahqzVar = new defpackage.ahqz(defpackage.ahns.k);
        if (ahqzVar.e()) {
            defpackage.ahok ahokVarB = this.a.b(1384, jAF, 1000000 * jAG);
            try {
                defpackage.ahns.k = ((defpackage.ahpe) defpackage.ahns.d.get()).c;
                defpackage.afec.a().post(new defpackage.aafk(4));
                defpackage.ahoq ahoqVarX = defpackage.ahvr.X(1385, "Application.onCreate", defpackage.ahot.a, true);
                try {
                    ((defpackage.aiyy) this.b.a()).a();
                    super.onCreate();
                    ahoqVarX.close();
                    ahokVarB.close();
                    return;
                } catch (java.lang.Throwable th) {
                    try {
                        ahoqVarX.close();
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th3) {
                try {
                    ahokVarB.close();
                    throw th3;
                } catch (java.lang.Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        }
        defpackage.ahpm ahpmVarA = ahqzVar.a();
        try {
            defpackage.ahou ahouVar = defpackage.ahot.a;
            defpackage.ahoq ahoqVarX2 = defpackage.ahvr.X(1382, "Application creation", ahouVar, true);
            try {
                defpackage.ahoq ahoqVarX3 = defpackage.ahvr.X(1383, "Application.onCreate", ahouVar, true);
                try {
                    ((defpackage.aiyy) this.b.a()).a();
                    super.onCreate();
                    ahoqVarX3.close();
                    ahoqVarX2.close();
                    ahpmVarA.close();
                } catch (java.lang.Throwable th5) {
                    try {
                        ahoqVarX3.close();
                        throw th5;
                    } catch (java.lang.Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
            } catch (java.lang.Throwable th7) {
                try {
                    ahoqVarX2.close();
                    throw th7;
                } catch (java.lang.Throwable th8) {
                    th7.addSuppressed(th8);
                    throw th7;
                }
            }
        } catch (java.lang.Throwable th9) {
            try {
                ahpmVarA.close();
                throw th9;
            } catch (java.lang.Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    @Override // defpackage.aheh
    public final long w() {
        return aa$.ExternalSyntheticApiModelOutline1.m();
    }
}

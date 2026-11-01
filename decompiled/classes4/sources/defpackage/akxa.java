package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class akxa extends defpackage.akxe {
    public akxa(defpackage.akxy akxyVar) {
        super(akxyVar);
    }

    private final ajcq f(defpackage.alfr alfrVar, defpackage.akxt akxtVar) {
        return ajan.f(h(defpackage.aknx.c(alfrVar, akxtVar)), new defpackage.ammx(1), ajbm.a);
    }

    private final ajcq g(defpackage.akxt akxtVar) {
        defpackage.akxv akxvVar = akxtVar.c;
        if (akxvVar == null) {
            akxvVar = defpackage.akxv.a;
        }
        return ajan.f(h(akxvVar.d), new defpackage.ammx(1), ajbm.a);
    }

    private final ajcq h(java.util.List list) {
        char c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.akwe akweVar = defpackage.akwe.DATA_USAGE_NONE;
        switch (this.a.ordinal()) {
            case 8:
                c = 3;
                break;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                c = 4;
                break;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                c = 5;
                break;
            default:
                c = 2;
                break;
        }
        aigb aigbVar = new aigb(4);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) it.next();
            if (num != null) {
                defpackage.akwf akwfVarA = defpackage.akxn.a(num.intValue());
                if (c == 3) {
                    akwfVarA = (defpackage.akwf) defpackage.akxn.a.getOrDefault(num, akwfVarA);
                } else if (c == 4) {
                    akwfVarA = (defpackage.akwf) defpackage.akxn.b.getOrDefault(num, akwfVarA);
                } else if (c == 5) {
                    akwfVarA = (defpackage.akwf) defpackage.akxn.c.getOrDefault(num, akwfVarA);
                }
                if (akwfVarA == null) {
                    aigbVar.i(num, java.lang.Integer.valueOf(defpackage.akwf.CPS_OR_NONCPS_UNKNOWN.a()));
                } else {
                    aigbVar.i(num, java.lang.Integer.valueOf(akwfVarA.a()));
                }
            }
        }
        return ajan.f(aiql.z(aigbVar.e(false)), new agnx(list, arrayList, 13, (byte[]) null), ajbm.a);
    }

    private static boolean i(defpackage.akwe akweVar) {
        defpackage.akwe akweVar2 = defpackage.akwe.DATA_USAGE_NONE;
        int iOrdinal = akweVar.ordinal();
        return iOrdinal == 7 || iOrdinal == 9 || iOrdinal == 24 || iOrdinal == 31;
    }

    private final boolean j() {
        return this.a == defpackage.akxy.DMA52_DATA_SHARING_V5 || k();
    }

    private final boolean k() {
        return this.a == defpackage.akxy.DMA52_DATA_SHARING_V6 || l();
    }

    private final boolean l() {
        return this.a == defpackage.akxy.DMA52_DATA_SHARING_V7;
    }

    @Override // defpackage.akxe
    public final ajcq a(defpackage.alfr alfrVar, defpackage.akxw akxwVar, defpackage.akxt akxtVar) {
        if (alfrVar.q) {
            return aiql.z(d(2, 18));
        }
        ajcq ajcqVarG = g(akxtVar);
        ajcq ajcqVarF = f(alfrVar, akxtVar);
        return aiql.Z(new ajcq[]{ajcqVarG, ajcqVarF}).c(new vuh(this, ajcqVarG, ajcqVarF, akxtVar, alfrVar, akxwVar, 6), ajbm.a);
    }

    /* JADX WARN: Code duplicated, block: B:137:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:182:? A[LOOP:0: B:15:0x0030->B:182:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f3  */
    /* JADX WARN: Failed to find 'out' block for switch in B:71:0x0105. Please report as an issue. */
    public final /* synthetic */ ajcq b(ajcq ajcqVar, ajcq ajcqVar2, defpackage.akxt akxtVar, defpackage.alfr alfrVar, defpackage.akxw akxwVar) {
        boolean z;
        boolean z2;
        int i;
        java.util.Iterator it;
        try {
            java.util.Set set = (java.util.Set) aiql.H(ajcqVar);
            java.util.Set set2 = (java.util.Set) aiql.H(ajcqVar2);
            defpackage.akxv akxvVar = akxtVar.c;
            if (akxvVar == null) {
                akxvVar = defpackage.akxv.a;
            }
            defpackage.akwk akwkVar = akxvVar.c;
            if (akwkVar == null) {
                akwkVar = defpackage.akwk.a;
            }
            int i2 = 4;
            java.util.Iterator it2 = (akwkVar.b == 4 ? (defpackage.akwh) akwkVar.c : defpackage.akwh.a).b.iterator();
            while (true) {
                if (it2.hasNext()) {
                    defpackage.akwo akwoVar = (defpackage.akwo) it2.next();
                    int iAR = a.aR(akwoVar.c);
                    if (iAR == 0 || iAR != 3) {
                        switch (akwoVar.d) {
                            case 0:
                                i = 2;
                                break;
                            case 1:
                                i = 3;
                                break;
                            case 2:
                                i = 4;
                                break;
                            case 3:
                                i = 5;
                                break;
                            case 4:
                                i = 6;
                                break;
                            case 5:
                                i = 7;
                                break;
                            case 6:
                                i = 8;
                                break;
                            case 7:
                                i = 9;
                                break;
                            case 8:
                                i = 10;
                                break;
                            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                                i = 11;
                                break;
                            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                                i = 12;
                                break;
                            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                                i = 13;
                                break;
                            case 12:
                                i = 14;
                                break;
                            case 13:
                                i = 15;
                                break;
                            case 14:
                                i = 16;
                                break;
                            case 15:
                                i = 17;
                                break;
                            case 16:
                                i = 18;
                                break;
                            case 17:
                                i = 19;
                                break;
                            case 18:
                                i = 20;
                                break;
                            case 19:
                                i = 21;
                                break;
                            case 20:
                                i = 22;
                                break;
                            case 21:
                                i = 23;
                                break;
                            case 22:
                                i = 24;
                                break;
                            case 23:
                                i = 25;
                                break;
                            case 24:
                                i = 26;
                                break;
                            case 25:
                                i = 27;
                                break;
                            case 26:
                                i = 28;
                                break;
                            case 27:
                                i = 29;
                                break;
                            case 28:
                                i = 30;
                                break;
                            case 29:
                                i = 31;
                                break;
                            case 30:
                                i = 32;
                                break;
                            case 31:
                                i = 33;
                                break;
                            case 32:
                                i = 34;
                                break;
                            case 33:
                                i = 35;
                                break;
                            default:
                                i = 0;
                                break;
                        }
                        if (i == 0) {
                            i = 1;
                        }
                        defpackage.akwe akweVar = defpackage.akwe.DATA_USAGE_NONE;
                        int i3 = i - 2;
                        switch (i3) {
                            case 5:
                            case 6:
                            case 8:
                            case 13:
                            case 14:
                            case 15:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 22:
                                break;
                            case 7:
                            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                            case 12:
                            case 16:
                            case 21:
                            default:
                                if (j()) {
                                    switch (i3) {
                                        case 26:
                                        case 27:
                                        case 28:
                                        case 29:
                                            break;
                                        default:
                                            it = new alam(akwoVar.e, defpackage.akwo.a).iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    break;
                                                } else {
                                                    defpackage.akwe akweVar2 = (defpackage.akwe) it.next();
                                                    if (!k() && i == 4) {
                                                        switch (akweVar2.ordinal()) {
                                                            case 35:
                                                            case 36:
                                                            case 37:
                                                                break;
                                                            default:
                                                                if (!i(akweVar2)) {
                                                                }
                                                                break;
                                                        }
                                                    } else if (!k() && i(akweVar2)) {
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                    }
                                } else {
                                    it = new alam(akwoVar.e, defpackage.akwo.a).iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            break;
                                        } else {
                                            defpackage.akwe akweVar3 = (defpackage.akwe) it.next();
                                            if (!k()) {
                                            }
                                            if (!k()) {
                                                continue;
                                            }
                                        }
                                    }
                                }
                                break;
                        }
                    }
                    z = true;
                } else {
                    z = false;
                }
            }
            defpackage.akxv akxvVar2 = akxtVar.c;
            if (akxvVar2 == null) {
                akxvVar2 = defpackage.akxv.a;
            }
            defpackage.akwk akwkVar2 = akxvVar2.c;
            if (akwkVar2 == null) {
                akwkVar2 = defpackage.akwk.a;
            }
            defpackage.akwh akwhVar = akwkVar2.b == 4 ? (defpackage.akwh) akwkVar2.c : defpackage.akwh.a;
            if (!l()) {
                z2 = false;
            } else if (akwhVar.d) {
                z2 = true;
            } else {
                defpackage.akwg akwgVar = akwhVar.e;
                if (akwgVar == null) {
                    akwgVar = defpackage.akwg.a;
                }
                defpackage.akwl akwlVar = akwgVar.b;
                if (akwlVar == null) {
                    akwlVar = defpackage.akwl.a;
                }
                if (!akwlVar.b) {
                    switch (akwhVar.c) {
                        case 0:
                            i2 = 2;
                            break;
                        case 1:
                            i2 = 3;
                            break;
                        case 2:
                            break;
                        case 3:
                            i2 = 5;
                            break;
                        case 4:
                            i2 = 6;
                            break;
                        case 5:
                            i2 = 7;
                            break;
                        case 6:
                            i2 = 8;
                            break;
                        case 7:
                            i2 = 9;
                            break;
                        case 8:
                            i2 = 10;
                            break;
                        case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                            i2 = 11;
                            break;
                        case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                            i2 = 12;
                            break;
                        case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                            i2 = 13;
                            break;
                        case 12:
                            i2 = 14;
                            break;
                        case 13:
                            i2 = 15;
                            break;
                        case 14:
                            i2 = 16;
                            break;
                        case 15:
                            i2 = 17;
                            break;
                        case 16:
                            i2 = 18;
                            break;
                        case 17:
                            i2 = 19;
                            break;
                        case 18:
                            i2 = 20;
                            break;
                        case 19:
                            i2 = 21;
                            break;
                        case 20:
                            i2 = 22;
                            break;
                        case 21:
                            i2 = 23;
                            break;
                        case 22:
                            i2 = 24;
                            break;
                        case 23:
                            i2 = 25;
                            break;
                        case 24:
                            i2 = 26;
                            break;
                        case 25:
                            i2 = 27;
                            break;
                        default:
                            i2 = 0;
                            break;
                    }
                    if (i2 == 0) {
                        i2 = 1;
                    }
                    defpackage.akwe akweVar4 = defpackage.akwe.DATA_USAGE_NONE;
                    switch (i2 - 2) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 24:
                        case 25:
                            z2 = true;
                            break;
                        case 22:
                        case 23:
                        default:
                            z2 = false;
                            break;
                    }
                } else {
                    z2 = true;
                }
            }
            boolean z3 = set.size() > 1;
            if (z && z2) {
                if (!z3) {
                    return aiql.z(d(2, 45));
                }
                z3 = true;
            }
            if (z2 && !z3) {
                return aiql.z(d(2, 46));
            }
            if (z && !z3) {
                return aiql.z(d(2, 2));
            }
            if (alfrVar.o) {
                return aiql.z(d(2, 20));
            }
            if (alfrVar.p && j()) {
                return aiql.z(d(3, 35));
            }
            if (set.size() == 1 && set.equals(set2)) {
                return aiql.z(d(2, 7));
            }
            ajcq ajcqVarG = g(akxtVar);
            ajcq ajcqVarF = f(alfrVar, akxtVar);
            anpu anpuVarAb = aiql.ab(new ajcq[]{ajcqVarG, ajcqVarF});
            vto vtoVar = new vto(ajcqVarG, ajcqVarF, akxwVar, 20);
            ajbm ajbmVar = ajbm.a;
            ajcq ajcqVarC = anpuVarAb.c(vtoVar, ajbmVar);
            return aiql.Z(new ajcq[]{ajcqVarC}).b(new afgu(this, ajcqVarC, 13), ajbmVar);
        } catch (java.util.concurrent.CancellationException | java.util.concurrent.ExecutionException e) {
            return aiql.y(e);
        }
    }

    public final /* synthetic */ defpackage.akxx c(ajcq ajcqVar) {
        try {
            boolean zBooleanValue = ((java.lang.Boolean) aiql.H(ajcqVar)).booleanValue();
            return d(zBooleanValue ? 2 : 3, (true != zBooleanValue ? 29 : 26) - 2);
        } catch (java.util.concurrent.CancellationException | java.util.concurrent.ExecutionException unused) {
            return d(3, 10005);
        }
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abtc implements abtb {
    public static final defpackage.abtc a = new defpackage.abtc();
    private final anrp[] b;

    /* JADX WARN: Code duplicated, block: B:27:0x004f A[FALL_THROUGH] */
    /* JADX WARN: Switch 'out' block B:27:0x004f for B:24:0x0048 already processed. Defaulting to fallback option. */
    private abtc() {
        int[] iArrB = aldj.b();
        int iMax = 0;
        for (int i = 0; i < 88; i++) {
            int i2 = iArrB[i];
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            iMax = java.lang.Math.max(iMax, i3);
        }
        this.b = new anrp[iMax + 1];
        int[] iArrB2 = aldj.b();
        for (int i4 = 0; i4 < 88; i4++) {
            int i5 = iArrB2[i4];
            int i6 = i5 - 1;
            if (i5 == 0) {
                throw null;
            }
            if (i6 != 17 && i6 != 27 && i6 != 78 && i6 != 82) {
                switch (i6) {
                    default:
                        switch (i6) {
                            default:
                                switch (i6) {
                                    default:
                                        switch (i6) {
                                            default:
                                                switch (i6) {
                                                    case 86:
                                                    case 87:
                                                    case 88:
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                            case 56:
                                            case 57:
                                            case 58:
                                            case 59:
                                            case 60:
                                            case 61:
                                            case 62:
                                            case 63:
                                            case 64:
                                            case 65:
                                            case 66:
                                            case 67:
                                            case 68:
                                            case 69:
                                            case 70:
                                            case 71:
                                            case 72:
                                            case 73:
                                                anrp[] anrpVarArr = this.b;
                                                anrp anrpVar = new anrp();
                                                anrpVarArr[i6] = anrpVar;
                                                anrpVar.a = aike.a;
                                                break;
                                        }
                                    case 31:
                                    case 32:
                                    case 33:
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37:
                                    case 38:
                                    case 39:
                                    case 40:
                                    case 41:
                                    case 42:
                                    case 43:
                                    case 44:
                                    case 45:
                                    case 46:
                                    case 47:
                                    case 48:
                                    case 49:
                                        anrp[] anrpVarArr2 = this.b;
                                        anrp anrpVar2 = new anrp();
                                        anrpVarArr2[i6] = anrpVar2;
                                        anrpVar2.a = aike.a;
                                        break;
                                }
                            case 19:
                            case 20:
                            case 21:
                                anrp[] anrpVarArr3 = this.b;
                                anrp anrpVar3 = new anrp();
                                anrpVarArr3[i6] = anrpVar3;
                                anrpVar3.a = aike.a;
                                break;
                        }
                    case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                    case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                    case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                    case 15:
                        anrp[] anrpVarArr4 = this.b;
                        anrp anrpVar4 = new anrp();
                        anrpVarArr4[i6] = anrpVar4;
                        anrpVar4.a = aike.a;
                        break;
                }
            } else {
                anrp[] anrpVarArr5 = this.b;
                anrp anrpVar5 = new anrp();
                anrpVarArr5[i6] = anrpVar5;
                anrpVar5.a = aike.a;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, java.util.List] */
    public final abta a(int i, absq absqVar) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    android.content.Context context = absqVar.a;
                    defpackage.vaa vaaVar = new defpackage.vaa(context.getApplicationContext());
                    if (defpackage.abtg.a == null) {
                        synchronized (defpackage.abtg.b) {
                            if (defpackage.abtg.a == null) {
                                defpackage.abtg abtgVar = new defpackage.abtg(context.getApplicationContext(), vaaVar);
                                android.os.HandlerThread handlerThread = new android.os.HandlerThread("CheckboxObserverThread");
                                handlerThread.start();
                                abtgVar.c.getContentResolver().registerContentObserver(android.provider.Settings.Global.getUriFor("multi_cb"), false, new defpackage.abtf(abtgVar, new aanh(handlerThread.getLooper())));
                                defpackage.abtg.a = abtgVar;
                            }
                        }
                    }
                    return defpackage.abtg.a;
                }
                if (i2 != 3) {
                    if (i2 != 4 && i2 != 5 && i2 != 26) {
                        switch (i2) {
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                                break;
                            default:
                                switch (i2) {
                                    case 22:
                                    case 23:
                                    case 24:
                                        break;
                                    default:
                                        anrp anrpVar = this.b[i2];
                                        defpackage.absx absxVarA = null;
                                        if (anrpVar != null) {
                                            ?? r4 = anrpVar.a;
                                            int i3 = ((aike) r4).d;
                                            for (int i4 = 0; i4 < i3; i4++) {
                                                defpackage.absz abszVar = (defpackage.absz) r4.get(i4);
                                                ahyn ahynVarA = abszVar.b().a();
                                                if (!ahynVarA.f() || ((aify) ahynVarA.b()).isEmpty()) {
                                                    absxVarA = abszVar.a();
                                                }
                                            }
                                        }
                                        if (absxVarA != null) {
                                            return absxVarA;
                                        }
                                        break;
                                }
                                break;
                        }
                    }
                }
            }
            return defpackage.absw.b;
        }
        return defpackage.absw.a;
    }
}

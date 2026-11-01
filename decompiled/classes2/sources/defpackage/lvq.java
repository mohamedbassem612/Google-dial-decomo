package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class lvq implements java.util.function.Predicate {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ lvq(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                break;
        }
        return j$.util.function.Predicate.-CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate negate() {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                break;
        }
        return j$.util.function.Predicate.-CC.$default$negate(this);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                break;
        }
        return j$.util.function.Predicate.-CC.$default$or(this, predicate);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:107:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:131:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x018a  */
    /* JADX WARN: Code duplicated, block: B:76:0x018e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0196  */
    /* JADX WARN: Code duplicated, block: B:82:0x019a  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v43, types: [java.lang.Object, java.util.Collection] */
    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object obj) {
        defpackage.fih fihVar;
        java.lang.Boolean bool;
        int i;
        defpackage.aeic aeicVar;
        int i2;
        defpackage.aeic aeicVar2;
        switch (this.$cid) {
            case 0:
                return android.text.TextUtils.equals(((defpackage.lvr) ((java.lang.Enum) obj)).b((android.content.Context) this.a), this.b);
            case 1:
                defpackage.eqg eqgVar = (defpackage.eqg) obj;
                if (((defpackage.fib) this.a).U && (((bool = (fihVar = (defpackage.fih) this.b).g) == null || !bool.booleanValue()) && (i = eqgVar.H) != -1 && i > 2)) {
                    java.lang.String str = eqgVar.p;
                    if (str == null) {
                        if (android.os.Build.VERSION.SDK_INT >= 32) {
                            return false;
                        }
                        return false;
                    }
                    switch (str.hashCode()) {
                        case -2123537834:
                            if (!str.equals("audio/eac3-joc")) {
                                if (android.os.Build.VERSION.SDK_INT >= 32) {
                                    return false;
                                }
                                return false;
                            }
                            if (android.os.Build.VERSION.SDK_INT >= 32 && (aeicVar2 = fihVar.h) != null && aeicVar2.a) {
                                if (android.os.Build.VERSION.SDK_INT >= 32 || (aeicVar = fihVar.h) == null || !aeicVar.a || !aeicVar.b() || !fihVar.h.c()) {
                                    return false;
                                }
                                defpackage.aeic aeicVar3 = fihVar.h;
                                defpackage.epu epuVar = fihVar.f;
                                if (!aeicVar3.d()) {
                                    return false;
                                }
                                if (j$.util.Objects.equals(str, "audio/eac3-joc")) {
                                    i2 = i != 16 ? i : 12;
                                } else if (j$.util.Objects.equals(str, "audio/iamf") || !j$.util.Objects.equals(str, "audio/ac4")) {
                                    i2 = i;
                                } else {
                                    i2 = 24;
                                    if (i != 18) {
                                        if (i == 21) {
                                            i = 21;
                                        } else {
                                            i2 = i;
                                        }
                                    }
                                }
                                int iG = eqgVar.I;
                                if (iG == -1 || i != i2) {
                                    iG = eum.g(i2);
                                }
                                if (iG == 0) {
                                    return false;
                                }
                                android.media.AudioFormat.Builder channelMask = new android.media.AudioFormat.Builder().setEncoding(2).setChannelMask(iG);
                                int i3 = eqgVar.J;
                                if (i3 != -1) {
                                    channelMask.setSampleRate(i3);
                                }
                                java.lang.Object obj2 = aeicVar3.d;
                                ahvr.ci(obj2);
                                if (!ebc$.ExternalSyntheticApiModelOutline7.m(ebc$.ExternalSyntheticApiModelOutline7.m(obj2), epuVar.a(), channelMask.build())) {
                                    return false;
                                }
                            }
                            break;
                        case 187078296:
                            if (!str.equals("audio/ac3")) {
                                if (android.os.Build.VERSION.SDK_INT >= 32) {
                                    return false;
                                }
                                return false;
                            }
                            if (android.os.Build.VERSION.SDK_INT >= 32) {
                                if (android.os.Build.VERSION.SDK_INT >= 32) {
                                    return false;
                                }
                                return false;
                            }
                            break;
                        case 187078297:
                            if (!str.equals("audio/ac4")) {
                                if (android.os.Build.VERSION.SDK_INT >= 32) {
                                    return false;
                                }
                                return false;
                            }
                            if (android.os.Build.VERSION.SDK_INT >= 32) {
                                if (android.os.Build.VERSION.SDK_INT >= 32) {
                                    return false;
                                }
                                return false;
                            }
                            break;
                        case 1504578661:
                            if (!str.equals("audio/eac3")) {
                                if (android.os.Build.VERSION.SDK_INT >= 32) {
                                    return false;
                                }
                                return false;
                            }
                            if (android.os.Build.VERSION.SDK_INT >= 32) {
                                if (android.os.Build.VERSION.SDK_INT >= 32) {
                                    return false;
                                }
                                return false;
                            }
                            break;
                        default:
                            if (android.os.Build.VERSION.SDK_INT >= 32) {
                                return false;
                            }
                            return false;
                    }
                }
                break;
            case 2:
                if (pez.bV((zzx) this.b, (quo) obj) != this.a) {
                    return false;
                }
                break;
            case 3:
                rlv rlvVar = ((vav) this.a).h;
                rlvVar.n(rmw.hX);
                kiu kiuVar = ((uzo) obj).d;
                if (kiuVar == null) {
                    kiuVar = kiu.a;
                }
                defpackage.hkd hkdVar = kiuVar.f;
                if (hkdVar == null) {
                    hkdVar = defpackage.hkd.a;
                }
                j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable((uip) ((aigf) this.b).get(hkdVar));
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((uip) optionalOfNullable.get()).j() == udj.c));
                }
                if (((java.lang.Boolean) optionalOfNullable.orElse(java.lang.Boolean.FALSE)).booleanValue()) {
                    vav.a.b().l("com/android/dialer/voicemail/notification/impl/VoicemailNotifierImpl", "filterSpamNumbersInternal", 375, "VoicemailNotifierImpl.java").v("found voicemail from spam number, suppressing notification");
                    rlvVar.n(rmw.hY);
                    return false;
                }
                break;
            case 4:
                yqb yqbVar = (yqb) obj;
                if (!yqbVar.c.equals(((j$.util.Optional) this.a).orElseThrow())) {
                    return false;
                }
                if (!yqbVar.b.equals(this.b)) {
                    return false;
                }
                break;
            case 5:
                vpj vpjVar = (vpj) obj;
                if (!vpjVar.c.equals(this.a)) {
                    return false;
                }
                if (!vpjVar.d.equals(this.b)) {
                    return false;
                }
                break;
            case 6:
                vzi vziVar = (vzi) obj;
                if (!vziVar.e.equals(this.b)) {
                    return false;
                }
                if (!vziVar.f.equals(((android.telecom.PhoneAccountHandle) this.a).getId())) {
                    return false;
                }
                break;
            case 7:
                android.telecom.Call parent = ((zpl) ((apqr) obj).a(zpl.class)).c().getParent();
                if (parent != null) {
                    return ((zpm) this.a).h.d(parent).equals(this.b);
                }
                return false;
            default:
                alig aligVar = (alig) obj;
                j$.util.stream.Stream stream = j$.util.Collection.-EL.stream(((aift) this.a).h());
                j$.util.Objects.requireNonNull(aligVar);
                if (!stream.noneMatch(new amcc(aligVar, 12))) {
                    return false;
                }
                j$.util.stream.Stream stream2 = j$.util.Collection.-EL.stream((java.util.Collection) this.b);
                j$.util.Objects.requireNonNull(aligVar);
                if (!stream2.anyMatch(new amcc(aligVar, 12))) {
                    return false;
                }
                break;
        }
        return true;
    }

    public /* synthetic */ lvq(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}

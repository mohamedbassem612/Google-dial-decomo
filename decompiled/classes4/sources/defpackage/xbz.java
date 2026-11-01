package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class xbz implements java.util.function.Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ xbz(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
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
            case 8:
                break;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                break;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                break;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00f0  */
    /* JADX WARN: Type inference failed for: r7v27, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v32, types: [aonj, java.lang.Object] */
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        boolean z;
        switch (this.$cid) {
            case 0:
                return java.lang.Boolean.valueOf(((zmw) obj).equals(this.a));
            case 1:
                j$.util.Optional optionalE = ((zpm) ((zzx) this.a).a).e(((wlc) obj).c);
                return true == optionalE.isPresent() ? j$.util.Optional.ofNullable(((wkt) ((apqr) optionalE.get()).a(wkt.class)).aV()) : optionalE;
            case 2:
                aimz aimzVar = com.android.voicemail.impl.DialerVisualVoicemailService.a;
                return ((vda) obj).c((android.telecom.PhoneAccountHandle) this.a);
            case 3:
                aimz aimzVar2 = com.android.voicemail.impl.DialerVisualVoicemailService.a;
                return ((vda) obj).c((android.telecom.PhoneAccountHandle) this.a);
            case 4:
                aimz aimzVar3 = com.android.voicemail.impl.DialerVisualVoicemailService.a;
                return ((vda) obj).c((android.telecom.PhoneAccountHandle) this.a);
            case 5:
                return ((vee) obj).i((android.telecom.PhoneAccountHandle) this.a);
            case 6:
                return a.l((aonj) this.a, obj);
            case 7:
                return ((zms) this.a).e((android.bluetooth.BluetoothDevice) obj);
            case 8:
                return this.a.a(obj);
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                return j$.time.Duration.between((j$.time.Instant) obj, j$.time.Instant.ofEpochMilli(((defpackage.alkk) this.a).c.toMillis()));
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                return java.lang.Boolean.valueOf(((java.lang.String) obj).equals(this.a));
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                return java.lang.Boolean.valueOf(((java.lang.String) obj).equals(this.a));
            case 12:
                defpackage.allb allbVar = (defpackage.allb) this.a;
                return allbVar.a(allbVar.b.a((java.lang.String) obj));
            case 13:
                j$.time.Instant instant = (j$.time.Instant) obj;
                j$.time.Duration duration = defpackage.allx.a;
                j$.time.Instant instant2 = (j$.time.Instant) this.a;
                return java.lang.Boolean.valueOf(instant2.isAfter(instant) || instant2.equals(instant));
            case 14:
                defpackage.alww alwwVar = (defpackage.alww) obj;
                akzx akzxVarP = alwwVar.p();
                akzx akzxVarP2 = (alwwVar.c == 3 ? (defpackage.alyp) alwwVar.d : defpackage.alyp.a).p();
                defpackage.alyp alypVar = alwwVar.c == 3 ? (defpackage.alyp) alwwVar.d : defpackage.alyp.a;
                java.lang.Object obj2 = this.a;
                if (!alypVar.g) {
                    defpackage.alww alwwVar2 = (defpackage.alww) obj2;
                    z = (alwwVar2.c == 3 ? (defpackage.alyp) alwwVar2.d : defpackage.alyp.a).g;
                }
                akzxVarP2.u();
                defpackage.alyp alypVar2 = (defpackage.alyp) akzxVarP2.b;
                alypVar2.b |= 16;
                alypVar2.g = z;
                defpackage.alww alwwVar3 = (defpackage.alww) obj2;
                int iAQ = a.aQ((alwwVar3.c == 3 ? (defpackage.alyp) alwwVar3.d : defpackage.alyp.a).f);
                int i = iAQ != 0 ? iAQ : 1;
                akzxVarP2.u();
                defpackage.alyp alypVar3 = (defpackage.alyp) akzxVarP2.b;
                alypVar3.f = i - 1;
                alypVar3.b |= 8;
                defpackage.alwf alwfVar = (alwwVar.c == 3 ? (defpackage.alyp) alwwVar.d : defpackage.alyp.a).d;
                if (alwfVar == null) {
                    alwfVar = defpackage.alwf.a;
                }
                defpackage.alwf alwfVar2 = (alwwVar3.c == 3 ? (defpackage.alyp) alwwVar3.d : defpackage.alyp.a).d;
                if (alwfVar2 == null) {
                    alwfVar2 = defpackage.alwf.a;
                }
                defpackage.alwf alwfVarV = airh.v(aify.q(alwfVar, alwfVar2), " \n");
                akzxVarP2.u();
                defpackage.alyp alypVar4 = (defpackage.alyp) akzxVarP2.b;
                j$.util.Objects.requireNonNull(alwfVarV);
                alypVar4.d = alwfVarV;
                alypVar4.b |= 2;
                akzxVarP.u();
                defpackage.alww alwwVar4 = (defpackage.alww) akzxVarP.b;
                defpackage.alyp alypVar5 = (defpackage.alyp) akzxVarP2.p();
                j$.util.Objects.requireNonNull(alypVar5);
                alwwVar4.d = alypVar5;
                alwwVar4.c = 3;
                return (defpackage.alww) akzxVarP.p();
            case 15:
                return java.lang.Boolean.valueOf(aizp.a(((alqu) this.a).e).isBefore((j$.time.Instant) obj));
            case 16:
                return ((defpackage.aluk) this.a).d((defpackage.alyp) obj);
            case 17:
                return java.lang.Boolean.valueOf(((defpackage.almm) this.a).d <= ((java.lang.Float) obj).floatValue());
            case 18:
                aimz aimzVar4 = defpackage.alzd.a;
                java.lang.Object obj3 = this.a;
                defpackage.alsy alsyVar = defpackage.alsy.PLAY_DTMF_TONE;
                akzx akzxVar = (akzx) obj3;
                akzxVar.u();
                defpackage.alxf alxfVar = (defpackage.alxf) akzxVar.b;
                defpackage.alxf alxfVar2 = defpackage.alxf.a;
                alxfVar.f = alsyVar.j;
                alxfVar.b |= 2;
                akzxVar.u();
                defpackage.alxf alxfVar3 = (defpackage.alxf) akzxVar.b;
                alxfVar3.d = java.lang.Integer.valueOf(((defpackage.alrf) obj).n);
                alxfVar3.c = 6;
                return (defpackage.alxf) akzxVar.p();
            case 19:
                java.lang.String str = (java.lang.String) obj;
                int i2 = defpackage.alzn.c;
                akzx akzxVarM = defpackage.alym.a.m();
                akzxVarM.u();
                defpackage.alym alymVar = (defpackage.alym) akzxVarM.b;
                alymVar.c = ((defpackage.alyl) this.a).h;
                alymVar.b |= 1;
                akzxVarM.u();
                defpackage.alym alymVar2 = (defpackage.alym) akzxVarM.b;
                j$.util.Objects.requireNonNull(str);
                alymVar2.b |= 2;
                alymVar2.d = str;
                return (defpackage.alym) akzxVarM.p();
            default:
                return (defpackage.alsy) ((aigf) this.a).get((defpackage.alyd) obj);
        }
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
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
            case 8:
                break;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                break;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                break;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}

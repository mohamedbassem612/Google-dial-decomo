package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class exw implements java.util.function.Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;

    public /* synthetic */ exw(int i, int i2) {
        this.$cid = i2;
        this.a = i;
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
            default:
                break;
        }
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                int i = this.a;
                int i2 = exy.b;
                return java.lang.Integer.valueOf(i);
            case 1:
                int i3 = this.a;
                int i4 = exy.b;
                return java.lang.Integer.valueOf(i3);
            case 2:
                java.lang.Integer num = (java.lang.Integer) obj;
                aooh.c(num);
                return gus.az(new mhc[]{gus.au(this.a), gus.au(num.intValue())});
            case 3:
                int i5 = okj.d;
                return gus.az(new mhc[]{gus.ax(((j$.util.Optional) obj).isPresent()), gus.av(this.a)});
            case 4:
                wmz wmzVar = (wmz) obj;
                akzx akzxVarM = wlf.a.m();
                java.lang.String str = java.lang.String.format(java.util.Locale.US, "session_%d_%s_%d", java.lang.Integer.valueOf(this.a), "TREE_ITEM", java.lang.Long.valueOf(wmzVar.e));
                akzxVarM.u();
                wlf wlfVar = akzxVarM.b;
                j$.util.Objects.requireNonNull(str);
                wlfVar.b |= 1;
                wlfVar.e = str;
                akzxVarM.u();
                wlf wlfVar2 = akzxVarM.b;
                j$.util.Objects.requireNonNull(wmzVar);
                wlfVar2.d = wmzVar;
                wlfVar2.c = 2;
                return akzxVarM.p();
            case 5:
                aimz aimzVar = defpackage.alij.a;
                return ((int[][]) ((java.util.Map.Entry) obj).getValue())[this.a];
            case 6:
                aimz aimzVar2 = defpackage.alij.a;
                return ((float[][][]) ((java.util.Map.Entry) obj).getValue())[this.a];
            case 7:
                return java.lang.Integer.valueOf(java.lang.Math.min(((java.lang.Integer) obj).intValue(), this.a));
            case 8:
                defpackage.alwe alweVar = (defpackage.alwe) obj;
                akzx akzxVarP = alweVar.p();
                int i6 = alweVar.c;
                int i7 = this.a;
                akzxVarP.u();
                defpackage.alwe alweVar2 = (defpackage.alwe) akzxVarP.b;
                alweVar2.b |= 1;
                alweVar2.c = i6 + i7;
                int i8 = alweVar.d + i7;
                akzxVarP.u();
                defpackage.alwe alweVar3 = (defpackage.alwe) akzxVarP.b;
                alweVar3.b |= 2;
                alweVar3.d = i8;
                return (defpackage.alwe) akzxVarP.p();
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                akzx akzxVarP2 = ((defpackage.alyi) obj).p();
                akzxVarP2.u();
                defpackage.alyi alyiVar = (defpackage.alyi) akzxVarP2.b;
                alyiVar.e = this.a - 1;
                alyiVar.b |= 4;
                return (defpackage.alyi) akzxVarP2.p();
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                defpackage.altp altpVar = (defpackage.altp) obj;
                akzx akzxVarM2 = defpackage.amfx.a.m();
                int i9 = altpVar.a;
                int i10 = this.a;
                akzxVarM2.u();
                defpackage.amfx amfxVar = (defpackage.amfx) akzxVarM2.b;
                amfxVar.b |= 1;
                amfxVar.c = i9 - i10;
                int i11 = altpVar.b - i10;
                akzxVarM2.u();
                defpackage.amfx amfxVar2 = (defpackage.amfx) akzxVarM2.b;
                amfxVar2.b |= 2;
                amfxVar2.d = i11;
                defpackage.amfw amfwVar = defpackage.amfw.VOICE_COMMAND;
                akzxVarM2.u();
                defpackage.amfx amfxVar3 = (defpackage.amfx) akzxVarM2.b;
                amfxVar3.e = amfwVar.f;
                amfxVar3.b |= 4;
                akzxVarM2.u();
                defpackage.amfx amfxVar4 = (defpackage.amfx) akzxVarM2.b;
                amfxVar4.b |= 8;
                amfxVar4.f = i10;
                return (defpackage.amfx) akzxVarM2.p();
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                aigf aigfVar = defpackage.amef.a;
                return java.lang.Integer.valueOf(((java.lang.Integer) ((java.util.Map.Entry) obj).getKey()).intValue() + this.a);
            case 12:
                defpackage.altp altpVar2 = (defpackage.altp) obj;
                int i12 = altpVar2.b;
                int i13 = this.a;
                if (i12 < i13) {
                    return j$.util.Optional.empty();
                }
                return altpVar2.a > i13 ? j$.util.Optional.of(altpVar2) : j$.util.Optional.of(defpackage.altp.b(i13, i12));
            default:
                return ((defpackage.altp) obj).a(-this.a);
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
            default:
                break;
        }
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}

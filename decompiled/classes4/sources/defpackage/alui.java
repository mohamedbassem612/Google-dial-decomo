package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class alui implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ alui(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                ((defpackage.aluk) this.a).a((defpackage.alww) obj);
                return;
            case 1:
                ((aift) this.a).i((defpackage.alww) obj);
                return;
            case 2:
                ((defpackage.aluk) this.a).s.e((defpackage.alro) obj);
                return;
            case 3:
                ((defpackage.alle) obj).a(this.a);
                return;
            case 4:
                defpackage.alvt alvtVar = (defpackage.alvt) obj;
                defpackage.alss alssVar = alvtVar.a;
                akzx akzxVar = (akzx) this.a;
                akzxVar.u();
                defpackage.alxy alxyVar = (defpackage.alxy) akzxVar.b;
                defpackage.alxy alxyVar2 = defpackage.alxy.a;
                alxyVar.f = alssVar.e;
                alxyVar.b |= 8;
                int i = alvtVar.b;
                akzxVar.u();
                defpackage.alxy alxyVar3 = (defpackage.alxy) akzxVar.b;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                alxyVar3.g = i2;
                alxyVar3.b |= 16;
                return;
            case 5:
                akzx akzxVar2 = (akzx) this.a;
                akzxVar2.u();
                defpackage.alxy alxyVar4 = (defpackage.alxy) akzxVar2.b;
                defpackage.alxy alxyVar5 = defpackage.alxy.a;
                alxyVar4.h = ((defpackage.alxw) obj).d;
                alxyVar4.b |= 32;
                return;
            case 6:
                defpackage.alxa alxaVar = (defpackage.alxa) obj;
                akzx akzxVar3 = (akzx) this.a;
                akzxVar3.u();
                defpackage.alnf alnfVar = (defpackage.alnf) akzxVar3.b;
                defpackage.alnf alnfVar2 = defpackage.alnf.a;
                j$.util.Objects.requireNonNull(alxaVar);
                alnfVar.j = alxaVar;
                alnfVar.b |= 8;
                return;
            case 7:
                defpackage.alss alssVar2 = ((defpackage.alvt) obj).a;
                boolean zEquals = alssVar2.equals(defpackage.alss.SPAM_STATUS_SPAM);
                java.lang.Object obj2 = this.a;
                if (zEquals) {
                    defpackage.alxx alxxVar = defpackage.alxx.DECISION_SPAM;
                    akzx akzxVar4 = (akzx) obj2;
                    akzxVar4.u();
                    defpackage.alxy alxyVar6 = (defpackage.alxy) akzxVar4.b;
                    defpackage.alxy alxyVar7 = defpackage.alxy.a;
                    alxyVar6.c = alxxVar.e;
                    alxyVar6.b |= 1;
                    return;
                }
                if (alssVar2.equals(defpackage.alss.SPAM_STATUS_NOT_SPAM)) {
                    defpackage.alxx alxxVar2 = defpackage.alxx.DECISION_NOT_SPAM;
                    akzx akzxVar5 = (akzx) obj2;
                    akzxVar5.u();
                    defpackage.alxy alxyVar8 = (defpackage.alxy) akzxVar5.b;
                    defpackage.alxy alxyVar9 = defpackage.alxy.a;
                    alxyVar8.c = alxxVar2.e;
                    alxyVar8.b |= 1;
                    return;
                }
                return;
            case 8:
                defpackage.alvt alvtVar2 = (defpackage.alvt) obj;
                defpackage.alss alssVar3 = alvtVar2.a;
                akzx akzxVar6 = (akzx) this.a;
                akzxVar6.u();
                defpackage.alxy alxyVar10 = (defpackage.alxy) akzxVar6.b;
                defpackage.alxy alxyVar11 = defpackage.alxy.a;
                alxyVar10.f = alssVar3.e;
                alxyVar10.b |= 8;
                int i3 = alvtVar2.b;
                akzxVar6.u();
                defpackage.alxy alxyVar12 = (defpackage.alxy) akzxVar6.b;
                int i4 = i3 - 1;
                if (i3 == 0) {
                    throw null;
                }
                alxyVar12.g = i4;
                alxyVar12.b |= 16;
                return;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                ((defpackage.alle) obj).a(this.a);
                return;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                defpackage.almm almmVar = (defpackage.almm) obj;
                akzx akzxVar7 = (akzx) this.a;
                akzxVar7.u();
                defpackage.alnf alnfVar3 = (defpackage.alnf) akzxVar7.b;
                defpackage.alnf alnfVar4 = defpackage.alnf.a;
                j$.util.Objects.requireNonNull(almmVar);
                alnfVar3.i = almmVar;
                alnfVar3.b |= 4;
                return;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                ((defpackage.alle) obj).a(this.a);
                return;
            case 12:
                ((defpackage.alzn) this.a).g((defpackage.almy) obj);
                return;
            case 13:
                ((defpackage.alle) obj).a(this.a);
                return;
            case 14:
                ((defpackage.alzs) this.a).g((defpackage.almy) obj);
                return;
            case 15:
                ((defpackage.alqf) this.a).a((java.lang.String) obj);
                return;
            case 16:
                defpackage.aa$$ExternalSyntheticApiModelOutline1.m16m(obj).accept(((defpackage.amcx) this.a).a());
                return;
            case 17:
                ((aift) this.a).i((defpackage.amce) obj);
                return;
            case 18:
                java.util.function.Consumer consumerM16m = defpackage.aa$$ExternalSyntheticApiModelOutline1.m16m(obj);
                aimz aimzVar = defpackage.amcx.a;
                consumerM16m.accept(this.a);
                return;
            case 19:
                ((defpackage.amgv) obj).g((defpackage.aloa) this.a);
                return;
            default:
                ((defpackage.amgv) obj).d((defpackage.almy) this.a);
                return;
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
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
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}

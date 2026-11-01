package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class amdj implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ amdj(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            int iIntValue = ((java.lang.Integer) obj).intValue();
            akzx akzxVar = (akzx) this.a;
            akzxVar.u();
            defpackage.amfz amfzVar = (defpackage.amfz) akzxVar.b;
            defpackage.amfz amfzVar2 = defpackage.amfz.a;
            amfzVar.b |= 2;
            amfzVar.d = iIntValue;
            return;
        }
        if (i == 1) {
            java.lang.String str = (java.lang.String) obj;
            akzx akzxVar2 = (akzx) this.a;
            akzxVar2.u();
            defpackage.amfz amfzVar3 = (defpackage.amfz) akzxVar2.b;
            defpackage.amfz amfzVar4 = defpackage.amfz.a;
            j$.util.Objects.requireNonNull(str);
            amfzVar3.b |= 4;
            amfzVar3.e = str;
            return;
        }
        if (i == 2) {
            ((aift) this.a).i((defpackage.amce) obj);
            return;
        }
        if (i == 3) {
            int iIntValue2 = ((java.lang.Integer) obj).intValue();
            akzx akzxVar3 = (akzx) this.a;
            akzxVar3.u();
            defpackage.amfz amfzVar5 = (defpackage.amfz) akzxVar3.b;
            defpackage.amfz amfzVar6 = defpackage.amfz.a;
            amfzVar5.b |= 2;
            amfzVar5.d = iIntValue2;
            return;
        }
        if (i != 4) {
            if (i != 5) {
                ((defpackage.alle) obj).a(this.a);
                return;
            } else {
                ((defpackage.alle) obj).a(this.a);
                return;
            }
        }
        java.lang.String str2 = (java.lang.String) obj;
        akzx akzxVar4 = (akzx) this.a;
        akzxVar4.u();
        defpackage.amfz amfzVar7 = (defpackage.amfz) akzxVar4.b;
        defpackage.amfz amfzVar8 = defpackage.amfz.a;
        j$.util.Objects.requireNonNull(str2);
        amfzVar7.b |= 4;
        amfzVar7.e = str2;
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        int i = this.$cid;
        if (i == 0) {
            return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        if (i == 1) {
            return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        if (i == 2) {
            return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        if (i == 3) {
            return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        if (i != 4) {
            return i != 5 ? j$.util.function.Consumer.-CC.$default$andThen(this, consumer) : j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cz implements defpackage.oh {
    private final /* synthetic */ int $cid;
    final /* synthetic */ defpackage.mp a;

    public cz(defpackage.rof rofVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(rofVar);
        this.a = rofVar;
    }

    /* JADX WARN: Type inference failed for: r7v13, types: [ahgj, java.lang.Object] */
    @Override // defpackage.oh
    public final void a() {
        int i = this.$cid;
        if (i == 0) {
            defpackage.mp mpVar = this.a;
            defpackage.dc dcVarJ = ((defpackage.da) mpVar).j();
            dcVarJ.e();
            mpVar.aT().c("androidx:appcompat");
            dcVarJ.q();
            return;
        }
        if (i == 1) {
            java.lang.Object obj = ((defpackage.az) this.a).e.a;
            defpackage.bd bdVar = (defpackage.bd) obj;
            bdVar.e.n(bdVar, (defpackage.bb) obj, null);
            return;
        }
        if (i != 2) {
            defpackage.mp mpVar2 = this.a;
            if (i != 3) {
                ((com.android.dialer.main.impl.MainActivity) mpVar2).A();
                ((defpackage.rof) mpVar2).B().i().b();
                return;
            }
            defpackage.rof rofVar = (defpackage.rof) mpVar2;
            if (rofVar.n) {
                return;
            }
            rofVar.n = true;
            rofVar.b().f();
            return;
        }
        defpackage.mp mpVar3 = this.a;
        android.os.Bundle bundleC = mpVar3.aT().c("android:support:activity-result");
        if (bundleC != null) {
            defpackage.on onVar = mpVar3.g;
            java.util.ArrayList<java.lang.Integer> integerArrayList = bundleC.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            java.util.ArrayList<java.lang.String> stringArrayList = bundleC.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            java.util.ArrayList<java.lang.String> stringArrayList2 = bundleC.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                onVar.c.addAll(stringArrayList2);
            }
            android.os.Bundle bundle = bundleC.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle != null) {
                onVar.f.putAll(bundle);
            }
            int size = stringArrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                java.lang.String str = stringArrayList.get(i2);
                java.util.Map map = onVar.b;
                if (map.containsKey(str)) {
                    java.lang.Integer num = (java.lang.Integer) map.remove(str);
                    if (!onVar.f.containsKey(str)) {
                        java.util.Map map2 = onVar.a;
                        defpackage.aoov.g(map2);
                        map2.remove(num);
                    }
                }
                java.lang.Integer num2 = integerArrayList.get(i2);
                defpackage.aooh.e(num2, "get(...)");
                int iIntValue = num2.intValue();
                java.lang.String str2 = stringArrayList.get(i2);
                defpackage.aooh.e(str2, "get(...)");
                onVar.c(iIntValue, str2);
            }
        }
    }

    public /* synthetic */ cz(defpackage.mp mpVar, int i) {
        this.$cid = i;
        this.a = mpVar;
    }

    public cz(defpackage.da daVar, int i) {
        this.$cid = i;
        this.a = daVar;
    }

    public cz(com.android.dialer.main.impl.MainActivity mainActivity, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(mainActivity);
        this.a = mainActivity;
    }
}

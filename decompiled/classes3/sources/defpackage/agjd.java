package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class agjd implements aonn {
    private final /* synthetic */ int $cid;

    public /* synthetic */ agjd(int i) {
        this.$cid = i;
    }

    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            int iIntValue = ((java.lang.Integer) obj).intValue();
            int iIntValue2 = ((java.lang.Integer) obj2).intValue();
            int[] iArr = defpackage.agjh.a;
            android.hardware.HardwareBuffer hardwareBufferCreate = android.hardware.HardwareBuffer.create(iIntValue, iIntValue2, 1, 1, 768L);
            aooh.e(hardwareBufferCreate, "create(...)");
            return hardwareBufferCreate;
        }
        if (i == 1) {
            cav cavVar = (cav) obj;
            ((java.lang.Integer) obj2).intValue();
            cavVar.u(314416020);
            ayn aynVar = new ayn(uu.i(cavVar), 16);
            cavVar.o();
            return aynVar;
        }
        if (i == 2) {
            boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
            aolp aolpVar = (aolp) obj2;
            aooh.f(aolpVar, "element");
            java.lang.String name = aolpVar.getClass().getName();
            aooh.e(name, "getName(...)");
            return java.lang.Boolean.valueOf(aoov.ad(name, "androidx.compose.ui.test.AndroidComposeUiTestEnvironment") | zBooleanValue);
        }
        if (i == 3) {
            anph anphVar = (anph) obj2;
            aooh.f((anqw) obj, "<unused var>");
            aooh.f(anphVar, "metadata");
            return java.lang.Boolean.valueOf(anphVar.b(defpackage.akaa.b) != null);
        }
        if (i == 4) {
            anqw anqwVar = (anqw) obj;
            aooh.f(anqwVar, "status");
            aooh.f((anph) obj2, "<unused var>");
            return java.lang.Boolean.valueOf(anqwVar.o == anqt.o);
        }
        java.lang.String str = (java.lang.String) obj;
        aolp aolpVar2 = (aolp) obj2;
        aooh.f(str, "acc");
        aooh.f(aolpVar2, "element");
        if (str.length() == 0) {
            return aolpVar2.toString();
        }
        return str + ", " + aolpVar2;
    }
}

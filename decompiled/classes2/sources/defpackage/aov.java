package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class aov implements aont {
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8) {
        int i;
        ((java.lang.Boolean) obj3).booleanValue();
        int iIntValue = ((java.lang.Integer) obj8).intValue();
        if ((iIntValue & 6) == 0) {
            i = (true != obj7.B(obj) ? 2 : 4) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= true != obj7.B(obj2) ? 16 : 32;
        }
        if ((iIntValue & 384) == 0) {
            i |= true != obj7.C(true) ? 128 : 256;
        }
        if ((iIntValue & 3072) == 0) {
            i |= true != obj7.B(obj4) ? 1024 : 2048;
        }
        if ((iIntValue & 24576) == 0) {
            i |= true != obj7.D(obj5) ? 8192 : 16384;
        }
        if ((iIntValue & 196608) == 0) {
            i |= true != obj7.D(obj6) ? 65536 : 131072;
        }
        if (obj7.H((599187 & i) != 599186, i & 1)) {
            defpackage.apa.b((java.lang.String) obj2, true, (defpackage.aox) obj4, obj, obj5, obj6, obj7, ((i >> 3) & 1022) | ((i << 9) & 7168) | (57344 & i) | (i & 458752));
        } else {
            obj7.s();
        }
        return aojh.a;
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@java.lang.Deprecated
public final class enj implements emv {
    private final java.lang.Object a;
    private final defpackage.emg b;

    public enj(java.lang.Object obj) {
        this.a = obj;
        this.b = defpackage.emi.a.b(obj.getClass());
    }

    public final void a(emx emxVar, emp empVar) {
        java.util.Map map = this.b.a;
        java.util.List list = (java.util.List) map.get(empVar);
        java.lang.Object obj = this.a;
        defpackage.emg.a(list, emxVar, empVar, obj);
        defpackage.emg.a((java.util.List) map.get(emp.ON_ANY), emxVar, empVar, obj);
    }
}

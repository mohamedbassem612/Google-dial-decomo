package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dvw implements java.lang.Iterable {
    public final java.util.ArrayList a = new java.util.ArrayList();
    public final android.content.Context b;

    public dvw(android.content.Context context) {
        this.b = context;
    }

    public final void a(android.content.Intent intent) {
        this.a.add(intent);
    }

    public final void b(android.content.Intent intent) {
        android.content.ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.b.getPackageManager());
        }
        if (component != null) {
            c(component);
        }
        a(intent);
    }

    public final void c(android.content.ComponentName componentName) {
        java.util.ArrayList arrayList = this.a;
        int size = arrayList.size();
        try {
            android.content.Context context = this.b;
            for (android.content.Intent intentK = dff.k(context, componentName); intentK != null; intentK = dff.k(context, intentK.getComponent())) {
                arrayList.add(size, intentK);
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            android.util.Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public final void d() {
        java.util.ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            throw new java.lang.IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        android.content.Intent[] intentArr = (android.content.Intent[]) arrayList.toArray(new android.content.Intent[0]);
        intentArr[0] = new android.content.Intent(intentArr[0]).addFlags(268484608);
        this.b.startActivities(intentArr, null);
    }

    @Override // java.lang.Iterable
    @java.lang.Deprecated
    public final java.util.Iterator iterator() {
        return this.a.iterator();
    }
}

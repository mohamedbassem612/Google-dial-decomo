package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dvn implements defpackage.dvc {
    public java.lang.String a;
    private java.util.ArrayList b = new java.util.ArrayList();
    private int c = 1;
    private java.util.ArrayList d = new java.util.ArrayList();
    private int e = 8388613;
    private int f = -1;
    private int g = 80;

    @Override // defpackage.dvc
    public final void b(defpackage.dva dvaVar) {
        android.os.Bundle bundle = new android.os.Bundle();
        if (!this.b.isEmpty()) {
            java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>(this.b.size());
            java.util.ArrayList arrayList2 = this.b;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                defpackage.duw duwVar = (defpackage.duw) arrayList2.get(i);
                androidx.core.graphics.drawable.IconCompat iconCompatA = duwVar.a();
                android.app.Notification.Action.Builder builder = new android.app.Notification.Action.Builder(iconCompatA == null ? null : defpackage.dvg.c(iconCompatA), duwVar.e, duwVar.f);
                android.os.Bundle bundle2 = new android.os.Bundle(duwVar.a);
                boolean z = duwVar.b;
                bundle2.putBoolean("android.support.allowGeneratedReplies", true);
                defpackage.dvl.c(builder, true);
                if (android.os.Build.VERSION.SDK_INT >= 31) {
                    defpackage.dvm.a(builder, false);
                }
                builder.addExtras(bundle2);
                dvf[] dvfVarArr = duwVar.g;
                if (dvfVarArr != null) {
                    for (android.app.RemoteInput remoteInput : dvf.b(dvfVarArr)) {
                        builder.addRemoteInput(remoteInput);
                    }
                }
                arrayList.add(builder.build());
            }
            bundle.putParcelableArrayList("actions", arrayList);
        }
        if (this.c != 1) {
            bundle.putInt("flags", 0);
        }
        if (!this.d.isEmpty()) {
            java.util.ArrayList arrayList3 = this.d;
            bundle.putParcelableArray("pages", (android.os.Parcelable[]) arrayList3.toArray(new android.app.Notification[arrayList3.size()]));
        }
        int i2 = this.e;
        if (i2 != 8388613) {
            bundle.putInt("contentIconGravity", i2);
        }
        if (this.f != -1) {
            bundle.putInt("contentActionIndex", 0);
        }
        int i3 = this.g;
        if (i3 != 80) {
            bundle.putInt("gravity", i3);
        }
        java.lang.String str = this.a;
        if (str != null) {
            bundle.putString("dismissalId", str);
        }
        dvaVar.b().putBundle("android.wearable.EXTENSIONS", bundle);
    }

    public final /* bridge */ /* synthetic */ java.lang.Object clone() {
        defpackage.dvn dvnVar = new defpackage.dvn();
        dvnVar.b = new java.util.ArrayList(this.b);
        dvnVar.c = this.c;
        dvnVar.d = new java.util.ArrayList(this.d);
        dvnVar.e = this.e;
        dvnVar.f = this.f;
        dvnVar.g = this.g;
        dvnVar.a = this.a;
        return dvnVar;
    }
}

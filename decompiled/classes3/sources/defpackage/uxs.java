package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class uxs implements defpackage.uxp {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ uxs(android.app.Activity activity, alad aladVar, int i) {
        this.$cid = i;
        this.b = activity;
        this.a = aladVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0077  */
    @Override // defpackage.uxp
    public final void a() {
        android.content.Intent intent;
        int i = this.$cid;
        if (i == 0) {
            mni.cB((android.content.Context) ((defpackage.vqf) this.a).a, ((defpackage.uxr) this.b).c);
            return;
        }
        java.lang.Object obj = this.a;
        if (i != 1) {
            defpackage.uxw.b((android.content.Context) this.b, new android.content.Intent("android.intent.action.DIAL", uyb.b(((defpackage.uxu) obj).c)), 2132017288);
            return;
        }
        java.lang.Object obj2 = this.b;
        try {
            java.util.List listJ = ahzf.b('.').j(((android.app.Activity) obj2).getPackageManager().getPackageInfo("com.google.android.contacts", 0).versionName);
            if (listJ.size() >= 2) {
                int i2 = java.lang.Integer.parseInt((java.lang.String) listJ.get(0));
                int i3 = java.lang.Integer.parseInt((java.lang.String) listJ.get(1));
                if (i2 != 3 ? i2 <= 3 : i3 < 5) {
                    intent = new android.content.Intent("android.intent.action.INSERT_OR_EDIT");
                    intent.setType("vnd.android.cursor.item/contact");
                } else if (((defpackage.uxq) obj).e) {
                    intent = new android.content.Intent("android.intent.action.INSERT", android.provider.ContactsContract.Contacts.CONTENT_URI);
                    intent.addFlags(1);
                } else {
                    intent = new android.content.Intent("android.intent.action.INSERT_OR_EDIT");
                    intent.setType("vnd.android.cursor.item/contact");
                }
            } else {
                intent = new android.content.Intent("android.intent.action.INSERT_OR_EDIT");
                intent.setType("vnd.android.cursor.item/contact");
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
        defpackage.uxq uxqVar = (defpackage.uxq) obj;
        intent.putExtra("phone", uxqVar.c);
        if ((uxqVar.b & 2) != 0) {
            intent.putExtra("name", uxqVar.d);
        }
        defpackage.uxw.b((android.content.Context) obj2, intent, 2132017288);
    }

    public /* synthetic */ uxs(defpackage.vqf vqfVar, defpackage.uxr uxrVar, int i) {
        this.$cid = i;
        this.a = vqfVar;
        this.b = uxrVar;
    }
}

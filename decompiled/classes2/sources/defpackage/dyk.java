package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class dyk implements defpackage.dyj {
    private final android.content.ClipData a;
    private final int b;
    private final int c;
    private final android.net.Uri d;
    private final android.os.Bundle e;

    public dyk(defpackage.dyh dyhVar) {
        android.content.ClipData clipData = dyhVar.a;
        dzk.x(clipData);
        this.a = clipData;
        int i = dyhVar.b;
        dzk.w(i, 0, 5, "source");
        this.b = i;
        this.c = dyhVar.c;
        this.d = dyhVar.d;
        this.e = dyhVar.e;
    }

    @Override // defpackage.dyj
    public final int a() {
        return this.c;
    }

    @Override // defpackage.dyj
    public final int b() {
        return this.b;
    }

    @Override // defpackage.dyj
    public final android.content.ClipData c() {
        return this.a;
    }

    @Override // defpackage.dyj
    public final android.view.ContentInfo d() {
        return null;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ContentInfoCompat{clip=");
        sb.append(this.a.getDescription());
        sb.append(", source=");
        int i = this.b;
        if (i != 1) {
            str = i != 2 ? "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD";
        } else {
            str = "SOURCE_CLIPBOARD";
        }
        sb.append(str);
        sb.append(", flags=");
        sb.append(1 != this.c ? "0" : "FLAG_CONVERT_TO_PLAIN_TEXT");
        android.net.Uri uri = this.d;
        if (uri == null) {
            str2 = "";
        } else {
            str2 = ", hasLinkUri(" + uri.toString().length() + ')';
        }
        sb.append(str2);
        sb.append(this.e != null ? ", hasExtras" : "");
        sb.append('}');
        return sb.toString();
    }
}

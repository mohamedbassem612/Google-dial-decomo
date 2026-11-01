package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aaxe extends defpackage.aafw implements defpackage.aavy {
    private final int d;

    public aaxe(com.google.android.gms.common.data.DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.d = i2;
    }

    public final java.lang.String toString() {
        com.google.android.gms.common.data.DataHolder dataHolder = this.a;
        boolean zIsLoggable = android.util.Log.isLoggable("DataItem", 3);
        int i = this.b;
        int i2 = this.c;
        dataHolder.d("data", i);
        byte[] blob = dataHolder.d[i2].getBlob(i, dataHolder.c.getInt("data"));
        int i3 = this.d;
        java.util.HashMap map = new java.util.HashMap(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            defpackage.aafw aafwVar = new defpackage.aafw(this.a, this.b + i4);
            if (aafwVar.b("asset_key") != null) {
                map.put(aafwVar.b("asset_key"), aafwVar);
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DataItemRef{ ");
        sb.append("uri=".concat(java.lang.String.valueOf(java.lang.String.valueOf(android.net.Uri.parse(b("path"))))));
        sb.append(", dataSz=".concat((blob == null ? "null" : java.lang.Integer.valueOf(blob.length)).toString()));
        sb.append(", numAssets=" + map.size());
        if (zIsLoggable && !map.isEmpty()) {
            sb.append(", assets=[");
            java.lang.String str = "";
            for (java.util.Map.Entry entry : map.entrySet()) {
                sb.append(str + ((java.lang.String) entry.getKey()) + ": " + ((defpackage.aavz) entry.getValue()).j());
                str = ", ";
            }
            sb.append(']');
        }
        sb.append(" }");
        return sb.toString();
    }
}

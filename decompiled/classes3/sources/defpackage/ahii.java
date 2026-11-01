package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahii extends aaoo {
    final /* synthetic */ defpackage.ahif a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahii(apjb apjbVar, defpackage.ahif ahifVar) {
        super((short[]) null);
        this.a = ahifVar;
        j$.util.Objects.requireNonNull(apjbVar);
    }

    public final java.util.List a() {
        aigf aigfVar = this.a.b;
        java.util.ArrayList arrayList = new java.util.ArrayList(aigfVar.size());
        ailj ailjVarK = aigfVar.e().k();
        while (ailjVarK.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) ailjVarK.next();
            defpackage.ahar aharVar = (defpackage.ahar) entry.getValue();
            if (aharVar.b == defpackage.ahap.b) {
                arrayList.add(new com.google.android.gms.feedback.FileTeleporter(aharVar.a.D(), (java.lang.String) entry.getKey()));
            }
        }
        return arrayList;
    }

    public final java.util.List b() {
        aigf aigfVar = this.a.b;
        java.util.ArrayList arrayList = new java.util.ArrayList(aigfVar.size());
        ailj ailjVarK = aigfVar.e().k();
        while (ailjVarK.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) ailjVarK.next();
            if (((defpackage.ahar) entry.getValue()).b == defpackage.ahap.a) {
                arrayList.add(new android.util.Pair((java.lang.String) entry.getKey(), ((defpackage.ahar) entry.getValue()).a.A()));
            }
        }
        return arrayList;
    }
}

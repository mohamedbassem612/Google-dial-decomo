package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class rc implements android.app.appsearch.observer.ObserverCallback {
    final /* synthetic */ defpackage.qy a;

    public rc(defpackage.qy qyVar) {
        this.a = qyVar;
    }

    public final void onDocumentChanged(android.app.appsearch.observer.DocumentChangeInfo documentChangeInfo) {
        dzk.x(documentChangeInfo);
        this.a.a(new defpackage.qx(ae$.ExternalSyntheticApiModelOutline0.m(documentChangeInfo), ae$.ExternalSyntheticApiModelOutline0.m$1(documentChangeInfo), ae$.ExternalSyntheticApiModelOutline0.m$2(documentChangeInfo), ae$.ExternalSyntheticApiModelOutline0.m$3(documentChangeInfo), ae$.ExternalSyntheticApiModelOutline0.m(documentChangeInfo)));
    }

    public final void onSchemaChanged(android.app.appsearch.observer.SchemaChangeInfo schemaChangeInfo) {
        dzk.x(schemaChangeInfo);
        this.a.b(new defpackage.ra(ae$.ExternalSyntheticApiModelOutline0.m(schemaChangeInfo), ae$.ExternalSyntheticApiModelOutline0.m$1(schemaChangeInfo), ae$.ExternalSyntheticApiModelOutline0.m(schemaChangeInfo)));
    }
}

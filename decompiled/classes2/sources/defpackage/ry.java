package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ry {
    static void a(android.app.appsearch.SearchSpec.Builder builder, defpackage.qt qtVar) {
        if (qtVar.j()) {
            rp$.ExternalSyntheticApiModelOutline0.m(builder, true);
        }
        if (qtVar.l()) {
            rp$.ExternalSyntheticApiModelOutline0.m$1(builder, true);
        }
        if (qtVar.i()) {
            rp$.ExternalSyntheticApiModelOutline0.m$2(builder, true);
        }
    }

    static void b(android.content.Context context, android.app.appsearch.SearchSpec.Builder builder, defpackage.qe qeVar, defpackage.rf rfVar) {
        rp$.ExternalSyntheticApiModelOutline0.m(builder, rp$.ExternalSyntheticApiModelOutline0.m(rp$.ExternalSyntheticApiModelOutline0.m$1(rp$.ExternalSyntheticApiModelOutline0.m(rp$.ExternalSyntheticApiModelOutline0.m(new android.app.appsearch.JoinSpec.Builder(qeVar.c), qeVar.a, defpackage.rl.c(context, qeVar.b, rfVar)), qeVar.d), 0)));
    }

    static void c(android.app.appsearch.SearchSpec.Builder builder, java.util.Map map) {
        for (java.util.Map.Entry entry : map.entrySet()) {
            rp$.ExternalSyntheticApiModelOutline0.m(builder, (java.lang.String) entry.getKey(), (java.util.Map) entry.getValue());
        }
    }
}

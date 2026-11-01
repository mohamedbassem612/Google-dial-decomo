package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class omf implements defpackage.olu, znk, zmp {
    private final java.util.List a = new java.util.concurrent.CopyOnWriteArrayList();
    private final zms b;

    public omf(zms zmsVar) {
        this.b = zmsVar;
    }

    @Override // defpackage.olu
    public final ajcq a() {
        java.lang.String string;
        otm otmVar = new otm((char[]) null);
        otmVar.a = "audio_routes_used";
        java.util.List list = this.a;
        if (list.isEmpty()) {
            string = "";
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
            for (int i = 0; i < list.size(); i++) {
                if (i != 0) {
                    sb.append(" -> ");
                }
                sb.append((java.lang.String) list.get(i));
            }
            sb.append(']');
            string = sb.toString();
        }
        otmVar.f(string);
        return aiql.z(otmVar.e());
    }

    public final ajcq b() {
        this.a.add(this.b.a().name());
        return ajcm.a;
    }

    public final void el(android.telecom.CallAudioState callAudioState) {
        this.a.add(zmw.a(callAudioState.getRoute()).name());
    }
}

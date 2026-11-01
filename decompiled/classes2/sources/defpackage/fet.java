package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fet implements defpackage.feu {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.feu
    public final defpackage.fno a(defpackage.eqg eqgVar) {
        java.lang.String str = eqgVar.p;
        if (str != null) {
            switch (str.hashCode()) {
                case -1354451219:
                    if (str.equals("application/vnd.dvb.ait")) {
                        return new defpackage.fnu();
                    }
                    break;
                case -1348231605:
                    if (str.equals("application/x-icy")) {
                        return new defpackage.fny();
                    }
                    break;
                case -1248341703:
                    if (str.equals("application/id3")) {
                        return new defpackage.foi(null);
                    }
                    break;
                case 1154383568:
                    if (str.equals("application/x-emsg")) {
                        return new defpackage.fnw();
                    }
                    break;
                case 1652648887:
                    if (str.equals("application/x-scte35")) {
                        return new defpackage.fov();
                    }
                    break;
            }
        }
        throw new java.lang.IllegalArgumentException("Attempted to create decoder for unsupported MIME type: ".concat(java.lang.String.valueOf(str)));
    }

    @Override // defpackage.feu
    public final boolean b(defpackage.eqg eqgVar) {
        java.lang.String str = eqgVar.p;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}

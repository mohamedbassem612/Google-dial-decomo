package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aatc extends defpackage.aatb {
    private final android.content.SharedPreferences d;

    public aatc(defpackage.aata aataVar, android.content.SharedPreferences sharedPreferences) {
        super(aataVar);
        this.d = sharedPreferences;
    }

    @Override // defpackage.aatb
    protected final java.lang.String a() {
        return this.d.getString("__phenotype_snapshot_token", null);
    }

    @Override // defpackage.aatb
    protected final boolean b(com.google.android.gms.phenotype.Configurations configurations) {
        android.content.SharedPreferences.Editor editorEdit = this.d.edit();
        if (!configurations.f) {
            editorEdit.clear();
        }
        boolean z = false;
        for (com.google.android.gms.phenotype.Configuration configuration : configurations.d) {
            if (configuration != null) {
                for (java.lang.String str : configuration.c) {
                    editorEdit.remove(str);
                }
                for (com.google.android.gms.phenotype.Flag flag : configuration.b) {
                    int i = flag.g;
                    if (i == 1) {
                        editorEdit.putLong(flag.a, flag.b());
                    } else if (i == 2) {
                        editorEdit.putBoolean(flag.a, flag.e());
                    } else if (i == 3) {
                        editorEdit.putFloat(flag.a, (float) flag.a());
                    } else if (i == 4) {
                        editorEdit.putString(flag.a, flag.c());
                    } else if (i == 5) {
                        editorEdit.putString(flag.a, android.util.Base64.encodeToString(flag.f(), 3));
                    }
                }
            }
        }
        editorEdit.putString("__phenotype_server_token", configurations.c);
        editorEdit.putLong("__phenotype_configuration_version", configurations.g);
        editorEdit.putString("__phenotype_snapshot_token", configurations.a);
        if (editorEdit.commit()) {
            z = true;
        } else {
            android.util.Log.w("PhenotypeFlagCommitter", "Failed to commit Phenotype configs to SharedPreferences!");
        }
        java.util.Map map = defpackage.aexd.a;
        synchronized (defpackage.aexd.class) {
            java.util.Iterator it = defpackage.aexd.a.values().iterator();
            if (it.hasNext()) {
                throw null;
            }
        }
        return z;
    }
}

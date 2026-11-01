package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class abdp extends android.app.backup.BackupAgentHelper {
    public static void b(android.content.SharedPreferences.Editor editor, java.lang.String str, java.lang.Object obj) {
        if (obj instanceof java.lang.Boolean) {
            editor.putBoolean(str, ((java.lang.Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof java.lang.Float) {
            editor.putFloat(str, ((java.lang.Float) obj).floatValue());
            return;
        }
        if (obj instanceof java.lang.Integer) {
            editor.putInt(str, ((java.lang.Integer) obj).intValue());
            return;
        }
        if (obj instanceof java.lang.Long) {
            editor.putLong(str, ((java.lang.Long) obj).longValue());
            return;
        }
        if (obj instanceof java.lang.String) {
            editor.putString(str, (java.lang.String) obj);
            return;
        }
        if (!(obj instanceof java.util.Set)) {
            android.util.Log.w("PersistentBackupAgentHe", "Skipping restore of key " + str + " because its value is the unrecognized type " + java.lang.String.valueOf(obj != null ? obj.getClass() : null) + '.');
            return;
        }
        java.util.Set<java.lang.String> set = (java.util.Set) obj;
        java.util.Iterator<java.lang.String> it = set.iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof java.lang.String)) {
                android.util.Log.w("PersistentBackupAgentHe", "Skipping restore of key " + str + " because its value is a set containing an object of type " + java.lang.String.valueOf(obj != null ? obj.getClass() : null) + '.');
                return;
            }
        }
        editor.putStringSet(str, set);
    }

    public static boolean c(java.lang.String str) {
        return (str.contains(java.io.File.separator) || str.contains("/") || "persistent_backup_agent_helper".equals(str)) ? false : true;
    }

    private final void d() {
        getSharedPreferences("persistent_backup_agent_helper", 0).edit().clear().apply();
    }

    protected abstract java.util.Map a();

    @Override // android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public void onBackup(android.os.ParcelFileDescriptor parcelFileDescriptor, android.app.backup.BackupDataOutput backupDataOutput, android.os.ParcelFileDescriptor parcelFileDescriptor2) throws java.io.IOException {
        java.util.Map mapA = a();
        android.content.SharedPreferences.Editor editorEdit = getSharedPreferences("persistent_backup_agent_helper", 0).edit();
        editorEdit.clear();
        for (java.util.Map.Entry entry : mapA.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            if (!c(str)) {
                throw new java.lang.IllegalArgumentException(a.bp((byte) 34, str, "Unsupported shared preferences file name \""));
            }
            for (java.util.Map.Entry<java.lang.String, ?> entry2 : getSharedPreferences(str, 0).getAll().entrySet()) {
                java.lang.String key = entry2.getKey();
                b(editorEdit, str + '/' + key, entry2.getValue());
            }
        }
        editorEdit.apply();
        super.onBackup(parcelFileDescriptor, backupDataOutput, parcelFileDescriptor2);
        d();
    }

    @Override // android.app.backup.BackupAgent
    public void onCreate() {
        addHelper("persistent_backup_agent_helper_prefs", new android.app.backup.SharedPreferencesBackupHelper(this, "persistent_backup_agent_helper"));
    }

    @Override // android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public void onRestore(android.app.backup.BackupDataInput backupDataInput, int i, android.os.ParcelFileDescriptor parcelFileDescriptor) throws java.io.IOException {
        super.onRestore(backupDataInput, i, parcelFileDescriptor);
        android.content.SharedPreferences sharedPreferences = getSharedPreferences("persistent_backup_agent_helper", 0);
        java.util.HashMap map = new java.util.HashMap();
        for (java.util.Map.Entry<java.lang.String, ?> entry : sharedPreferences.getAll().entrySet()) {
            java.lang.String key = entry.getKey();
            java.lang.Object value = entry.getValue();
            int iIndexOf = key.indexOf("/");
            if (iIndexOf < 0 || iIndexOf >= key.length() - 1) {
                android.util.Log.w("PersistentBackupAgentHe", a.bk(key, "Format of key \"", "\" not understood, so skipping its restore."));
            } else {
                java.lang.String strSubstring = key.substring(0, iIndexOf);
                java.lang.String strSubstring2 = key.substring(iIndexOf + 1);
                android.content.SharedPreferences.Editor editorEdit = (android.content.SharedPreferences.Editor) map.get(strSubstring);
                if (editorEdit == null) {
                    if (c(strSubstring)) {
                        editorEdit = getSharedPreferences(strSubstring, 0).edit();
                        map.put(strSubstring, editorEdit);
                    } else {
                        android.util.Log.w("PersistentBackupAgentHe", a.bp((byte) 34, strSubstring, "Skipping unsupported shared preferences file name \""));
                    }
                }
                b(editorEdit, strSubstring2, value);
            }
        }
        java.util.Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((android.content.SharedPreferences.Editor) it.next()).apply();
        }
        map.keySet();
        d();
    }
}

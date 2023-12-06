import hashlib
from flask import session

class Utils:
    def md5(self, string):
        return hashlib.md5(string.encode('utf-8')).hexdigest()

    def validate_not_empty(self, array):
        return not any(item == '' or item is None for item in array)

    def get_alert(self):
        try:
            return session['alert']
        except:
            return False

    def set_alert(self, type, text):
        session['alert'] = {'type': type, 'text': text}

    def unset_alert(self):
        session['alert'] = None
        return ''
